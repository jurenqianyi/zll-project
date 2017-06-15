package com.zll.web.session.store;

import java.util.HashMap;
import java.util.Map;

import javacommon.memcached.MemcachedManager;
import javacommon.util.MapUtil;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

/**
 * Cache sessionStore
 * @author qy
 *
 */
public class CacheSessionStore extends SessionStore implements InitializingBean{
	
	public void afterPropertiesSet() throws Exception {
		Assert.notNull("cache must be not null");
	}
	
	public void deleteSession(String sessionId) {
		MemcachedManager.getInstance().delete(sessionId);
	}

	public Map getSession(String sessionId,int timeoutSeconds) {
		Map result = (Map)get(sessionId);
		if(result == null){
			result = new HashMap();
		}
		return result;
	}

	private Object get(String sessionId) {
		return MemcachedManager.getInstance().get(sessionId);
	}

	public void saveSession(String sessionId,Map sessionData,int timeoutSeconds) {
		if(MapUtil.isEmpty(sessionData)) return;
		MemcachedManager.getInstance().set(sessionId, sessionData, 24 * 60 * 60);//35*60
	}

}
