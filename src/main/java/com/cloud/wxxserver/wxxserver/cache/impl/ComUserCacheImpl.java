package com.cloud.wxxserver.wxxserver.cache.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.ParserConfig;
import com.cloud.ftl.ftlbasic.enums.Update;
import com.cloud.ftl.ftlbasic.exception.BusiException;
import com.cloud.ftl.ftlbasic.service.BaseServiceImpl;
import com.cloud.ftl.ftlbasic.utils.QueryKeyUtil;
import com.cloud.ftl.ftlbasic.webEntity.PageBean;
import com.cloud.wxxserver.wxxserver.cache.IComUserCache;
import com.cloud.wxxserver.wxxserver.entity.ComUser;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * IComUserCache cache实现类
 * @author lijun
 */
@Slf4j
public class ComUserCacheImpl extends BaseServiceImpl<ComUser> implements IComUserCache {

    private final static Long DEFAULT_EXPIRE_TIMES = 30L;
    private final static TimeUnit DEFAULT_EXPIRE_TIMEUNIT = TimeUnit.MINUTES;
    private final static String CLS_NAME = ComUser.class.getSimpleName();
    private final static String QUERY_KEY = CLS_NAME.concat(":Query:");

    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    @Override
    public ComUser cacheSelectById(Serializable id, String... nullErrMsg) {
        String entityKey = CLS_NAME.concat(":").concat(String.valueOf(id));
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        ComUser cacheVal = (ComUser)redisTemplate.opsForValue().get(entityKey);
        if(Objects.nonNull(cacheVal)){
            return cacheVal;
        }
        ComUser dbVal = super.selectById(id, nullErrMsg);
        if(Objects.nonNull(dbVal)){
            redisTemplate.opsForValue().set(entityKey,dbVal);
            redisTemplate.expire(entityKey,DEFAULT_EXPIRE_TIMES, DEFAULT_EXPIRE_TIMEUNIT);
        }
        return dbVal;
    }

    @Override
    public ComUser cacheSelectOne(ComUser query, String... nullErrMsg) {
        query.setPage(1);
        query.setPageSize(1);
        String queryKey = QUERY_KEY.concat("SelectOne:")
                .concat(QueryKeyUtil.getQueryKey(query, Boolean.TRUE));
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        ComUser cacheVal = (ComUser)redisTemplate.opsForValue().get(queryKey);
        if(Objects.nonNull(cacheVal)){
            return cacheVal;
        }
        ComUser dbVal = super.selectOne(query, nullErrMsg);
        if(Objects.nonNull(dbVal)){
            redisTemplate.opsForValue().set(queryKey,dbVal);
            redisTemplate.expire(queryKey,DEFAULT_EXPIRE_TIMES, DEFAULT_EXPIRE_TIMEUNIT);
        }
        return dbVal;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<ComUser> cacheSelectList(ComUser query, String... emptyErrMsg) {
        String queryKey = QUERY_KEY.concat("SelectList:")
                .concat(QueryKeyUtil.getQueryKey(query, Boolean.FALSE));
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        Object cacheValues = redisTemplate.opsForValue().get(queryKey);
        if(Objects.nonNull(cacheValues)){
            return JSONArray.parseArray(JSON.toJSONString(cacheValues),ComUser.class);
        }
        List<ComUser> dbValues = super.selectList(query, emptyErrMsg);
        if(!CollectionUtils.isEmpty(dbValues)){
            redisTemplate.opsForValue().set(queryKey,dbValues);
            redisTemplate.expire(queryKey,DEFAULT_EXPIRE_TIMES, DEFAULT_EXPIRE_TIMEUNIT);
        }
        return dbValues;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<ComUser> cacheSelectList(ComUser query, List<String> fieldList, String... emptyErrMsg) {
        if(CollectionUtils.isEmpty(fieldList)){
            throw new BusiException("请指定查询的域");
        }
        String queryKey = QUERY_KEY.concat("FieldSelectList:")
                .concat(QueryKeyUtil.getQueryKey(query, Boolean.FALSE,fieldList.toArray(new String[fieldList.size()])));
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        Object cacheValues = redisTemplate.opsForValue().get(queryKey);
        if(Objects.nonNull(cacheValues)){
            return JSONArray.parseArray(JSON.toJSONString(cacheValues),ComUser.class);
        }
        List<ComUser> dbValues = super.selectList(query, fieldList, emptyErrMsg);
        if(!CollectionUtils.isEmpty(dbValues)){
            redisTemplate.opsForValue().set(queryKey,dbValues);
            redisTemplate.expire(queryKey,DEFAULT_EXPIRE_TIMES, DEFAULT_EXPIRE_TIMEUNIT);
        }
        return dbValues;
    }

    @Override
    public List<ComUser> cacheSelectBatchIds(Collection<? extends Serializable> list, String... emptyErrMsg) {
        if(!CollectionUtils.isEmpty(list)){
            List<? extends Serializable> sortIds = list.stream().sorted().collect(Collectors.toList());
            String queryKey = QUERY_KEY.concat("SelectBatchIds:").concat(sortIds.toString());
            Object cacheValues = redisTemplate.opsForValue().get(queryKey);
            if(Objects.nonNull(cacheValues)){
                return JSONArray.parseArray(JSON.toJSONString(cacheValues),ComUser.class);
            }
            List<ComUser> dbValues = super.selectBatchIds(sortIds, emptyErrMsg);
            if(!CollectionUtils.isEmpty(dbValues)){
                redisTemplate.opsForValue().set(queryKey,dbValues);
                redisTemplate.expire(queryKey,DEFAULT_EXPIRE_TIMES, DEFAULT_EXPIRE_TIMEUNIT);
            }
            return dbValues;
        }
        return Lists.newArrayList();
    }

    @Override
    @SuppressWarnings("unchecked")
    public PageBean<ComUser> cacheSelectPage(ComUser query) {
        String queryKey = QUERY_KEY.concat("SelectPage:").concat(QueryKeyUtil.getQueryKey(query, Boolean.TRUE));
        PageBean<ComUser> cachePageBean = (PageBean<ComUser>)redisTemplate.opsForValue().get(queryKey);
        if(Objects.nonNull(cachePageBean)){
            return cachePageBean;
        }
        PageBean<ComUser> dbPageBean = super.selectPage(query);
        redisTemplate.opsForValue().set(queryKey,dbPageBean);
        redisTemplate.expire(queryKey,DEFAULT_EXPIRE_TIMES,DEFAULT_EXPIRE_TIMEUNIT);
        return dbPageBean;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PageBean<ComUser> cacheSelectPage(ComUser query, List<String> fieldList) {
        String queryKey = QUERY_KEY.concat("FieldSelectPage:")
                .concat(QueryKeyUtil.getQueryKey(query, Boolean.TRUE,fieldList.toArray(new String[fieldList.size()])));
        PageBean<ComUser> cachePageBean = (PageBean<ComUser>)redisTemplate.opsForValue().get(queryKey);
        if(Objects.nonNull(cachePageBean)){
            return cachePageBean;
        }
        PageBean<ComUser> dbPageBean = super.selectPage(query, fieldList);
        redisTemplate.opsForValue().set(queryKey,dbPageBean);
        redisTemplate.expire(queryKey,DEFAULT_EXPIRE_TIMES,DEFAULT_EXPIRE_TIMEUNIT);
        return dbPageBean;
    }

    @Override
    public Long cacheSelectCount(ComUser query) {
        String queryKey = QUERY_KEY.concat("SelectCount:")
                .concat(QueryKeyUtil.getQueryKey(query, Boolean.FALSE));
        Long cacheCount = (Long)redisTemplate.opsForValue().get(queryKey);
        if(Objects.nonNull(cacheCount)){
            log.info("Cache Class = {}, Entity = {} Count",ComUser.class.getName(),query);
            return cacheCount;
        }
        Long dbCount = super.selectCount(query);
        redisTemplate.opsForValue().set(queryKey,dbCount);
        redisTemplate.expire(queryKey,DEFAULT_EXPIRE_TIMES,DEFAULT_EXPIRE_TIMEUNIT);
        return dbCount;
    }

    @Override
    public int update(ComUser entity, Update... args) {
        int updateCount = super.update(entity, args);
        clearAllCacheData();
        return updateCount;
    }

    @Override
    public int updateByMap(ComUser oEntity, Map<String, Object> updateMap) {
        int updateCount = super.updateByMap(oEntity, updateMap);
        clearAllCacheData();
        return updateCount;
    }

    @Override
    public void updateBatch(List<ComUser> list, Update... args) {
        super.updateBatch(list, args);
        clearAllCacheData();
    }

    @Override
    public int add(ComUser entity) {
        int addCount = super.add(entity);
        clearAllCacheData();
        return addCount;
    }

    @Override
    public void addBatch(List<ComUser> list) {
        super.addBatch(list);
        clearAllCacheData();
    }

    @Override
    public void addBatch(List<ComUser> list, int batchSize) {
        super.addBatch(list, batchSize);
        clearAllCacheData();
    }

    @Override
    public void delete(ComUser entity) {
        super.delete(entity);
        clearAllCacheData();
    }

    @Override
    public int deleteById(Serializable id) {
        int deleteCount = super.deleteById(id);
        clearAllCacheData();
        return deleteCount;
    }

    @Override
    public void deleteBatchIds(Collection<? extends Serializable> list) {
        super.deleteBatchIds(list);
        clearAllCacheData();
    }

    @Override
    public void save(ComUser comUser, Update... args) {
        super.save(comUser, args);
        clearAllCacheData();
    }

    @Override
    public void saveBatch(List<ComUser> list, Update... args) {
        super.saveBatch(list, args);
        clearAllCacheData();
    }

    private void clearAllCacheData(){
        try {
            Set<String> keys = redisTemplate.keys(ComUser.class.getSimpleName() + "*");
            if(!CollectionUtils.isEmpty(keys)){
                redisTemplate.delete(keys);
            }
        } catch (Exception e) {
            log.error("清除缓存失败，请手动处理",e);
        }
    }

}