package com.cloud.wxxserver.wxxserver.dao.security;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.cloud.ftl.ftlbasic.mapper.IBaseMapper;
import org.apache.ibatis.annotations.Param;
import com.cloud.wxxserver.wxxserver.entity.SysUser;

/**
  * 接口类 ISysUserDao
  * @author lijun
  */
@Repository
public interface ISysUserDao extends IBaseMapper<SysUser>{

    //------------------------ custom code begin ------------------------//
    
    //======================== custom code end ========================//

}