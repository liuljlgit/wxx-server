package com.cloud.wxxserver.wxxserver.service.impl;

import org.springframework.stereotype.Service;
import com.cloud.wxxserver.wxxserver.cache.impl.ComUserCacheImpl;
import com.cloud.wxxserver.wxxserver.service.IComUserService;

/**
 * IComUserService service实现类
 * @author lijun
 */
@Service("comUserService")
public class ComUserServiceImpl extends ComUserCacheImpl implements IComUserService {


}