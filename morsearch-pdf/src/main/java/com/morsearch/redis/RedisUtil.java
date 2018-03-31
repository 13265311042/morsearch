package com.morsearch.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;


public class RedisUtil {
	private static JedisPool jedisPool;
	private static Jedis redisjedis;


	/*初始化*/
	public static Jedis initialPool() {
		Properties redispps = new Properties();
		try {
			redispps.load(RedisUtil.class.getResourceAsStream("/redis.properties"));
			JedisPoolConfig config = new JedisPoolConfig();
			config.setMaxIdle(Integer.parseInt(redispps.getProperty("redis.maxIdle")));
			config.setMaxWaitMillis(Integer.parseInt(redispps.getProperty("redis.maxWait")));
			config.setMaxTotal(Integer.parseInt(redispps.getProperty("redis.maxTotal")));
			config.setTestOnBorrow(Boolean.valueOf(redispps.getProperty("redis.testOnBorrow")));
			config.setTestOnReturn(Boolean.valueOf(redispps.getProperty("redis.testOnReturn")));
			jedisPool = new JedisPool(config,redispps.getProperty("redis.host"),Integer.parseInt(redispps.getProperty("redis.port"))
					,0,redispps.getProperty("redis.pass"));
			return jedisPool.getResource();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return  null;
	}

	public static int deleteValue(final String key) {
		try{
		if (redisjedis==null){redisjedis=initialPool();};
		redisjedis.del(key);
		redisjedis.disconnect();;
			return 1;
		}catch (Exception ex){
			ex.printStackTrace();
		};
		return 0;
	}

	public static String getStringValue(final String key) {
		try{
			if (redisjedis==null){redisjedis=initialPool();};
			String rut=redisjedis.get(key);
			redisjedis.disconnect();
			return rut;
		}catch (Exception ex){
			ex.printStackTrace();
		};
		return null;
	}

	public static int saveStringValue(final String key, final String Value, final int expire) {
		try{
			if (redisjedis==null){redisjedis=initialPool();};
			 redisjedis.set(key,Value);
			if (expire>0) {redisjedis.expire(key,expire);};
			redisjedis.disconnect();
			return 1;
		}catch (Exception ex){
			ex.printStackTrace();
		};
		return 0;
	}

	public static Map<String, String> getMapValue(final String key) {
		try{
			if (redisjedis==null){redisjedis=initialPool();};
			Map<String, String> aa=redisjedis.hgetAll(key);
			redisjedis.disconnect();
			return aa;
		}catch (Exception ex){
			ex.printStackTrace();
		};
		return null;
	}


	public static String getMapRow(final String key, final String row) {
		try{
			if (redisjedis==null){redisjedis=initialPool();};
			String aa=redisjedis.hget(key,row);
			redisjedis.disconnect();
			return aa;
		}catch (Exception ex){
			ex.printStackTrace();
		};
		return null;
	}

	public static int removeMapRow(final String key, final String row) {
		try{
			if (redisjedis==null){redisjedis=initialPool();};
			redisjedis.hdel(key,row);
			redisjedis.disconnect();
			return 1;
		}catch (Exception ex){
			ex.printStackTrace();
		};
		return 0;
	}

	public static int saveMapRow(final String key,final String row,final String value) {
		try{
			if (redisjedis==null){redisjedis=initialPool();};
			redisjedis.hset(key,row,value);
			redisjedis.disconnect();;
			return 1;
		}catch (Exception ex){
			ex.printStackTrace();
		};
		return 0;
	}



	public static int removeListRow(final String key, final String value) {
		try{
			if (redisjedis==null){redisjedis=initialPool();};
			redisjedis.lrem(key,0,value);
			redisjedis.disconnect();
			return 1;
		}catch (Exception ex){
			ex.printStackTrace();
		};
		return 0;
	}

	public static int saveListRow(final String key, final String value) {
		try{
			if (redisjedis==null){redisjedis=initialPool();};
			redisjedis.lpush(key,value);
			redisjedis.disconnect();
			return 1;
		}catch (Exception ex){
			ex.printStackTrace();
		};
		return 0;
	}


	public static List<String> getListValue(final String key) {
		try{
			if (redisjedis==null){redisjedis=initialPool();};
			List<String> aa=redisjedis.lrange(key,0,-1);
			redisjedis.disconnect();
			return aa;
		}catch (Exception ex){
			ex.printStackTrace();
		};
		return null;
	}


	public static String getListRow(final String key, final String row) {
		try{
			if (redisjedis==null){redisjedis=initialPool();};
			String  aa=redisjedis.hget(key,row);
			redisjedis.disconnect();
			return aa;
		}catch (Exception ex){
			ex.printStackTrace();
		};
		return null;
	}






}
