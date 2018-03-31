package com.morsearch.service.impl;

import com.morsearch.common.constant.Constants;
import com.morsearch.dao.Acc_BuyMapper;
import com.morsearch.dao.Sys_WordListMapper;
import com.morsearch.model.Acc_Buy;
import com.morsearch.model.Sys_User;
import com.morsearch.model.Sys_WordList;
import com.morsearch.model.Sys_WordListExample;
import com.morsearch.service.OrderService;
import com.morsearch.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;


@Service("redisService")

public class RedisServiceImpl implements RedisService {
	@Autowired
	private RedisTemplate<Serializable, Serializable> redisTemplate;

	@Override
	public int deleteValue(final String key) {
		return redisTemplate.execute(new RedisCallback<Integer>() {
			public Integer doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] keys = redisTemplate.getStringSerializer().serialize(key);
				connection.del(keys);
				return 0;
			}
		});
	}

	@Override
	public boolean checkValue(final String key) {
		return redisTemplate.execute(new RedisCallback<Boolean>() {
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] keys = redisTemplate.getStringSerializer().serialize(key);
				return  connection.exists(keys);
			}
		});
	}

	@Override
	public String getStringValue(final String key) {
		return redisTemplate.execute(new RedisCallback<String>() {
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] keyb = redisTemplate.getStringSerializer().serialize(key);
				if (connection.exists(keyb)) {
					byte[] value = connection.get(keyb);
					return redisTemplate.getStringSerializer().deserialize(value);
				}
				return null;
			}
		});
	}

	@Override
	public int saveStringValue(final String key, final String Value, final int expire) {
		redisTemplate.execute(new RedisCallback<Object>() {
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] keyb = redisTemplate.getStringSerializer().serialize(key);
				connection.set(keyb,redisTemplate.getStringSerializer().serialize(Value));
				if (expire>0){connection.expire(keyb,expire);};
				return null;
			}
		});
		return 1;
	}

	@Override
	public Map<String, String> getMapValue(final String key) {
		return redisTemplate.execute(new RedisCallback<Map<String, String>>() {
			public Map<String, String> doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] keyb = redisTemplate.getStringSerializer().serialize(key);
				if (connection.exists(keyb)) {
					Map<byte[], byte[]> map = connection.hGetAll(keyb);
					Map<String, String> mapdetail = new HashMap<String, String>();
					Set<Map.Entry<byte[], byte[]>> entrySet = map.entrySet();
					for (Map.Entry<byte[], byte[]> entry: entrySet) {
						mapdetail.put(redisTemplate.getStringSerializer().deserialize(entry.getKey()),redisTemplate.getStringSerializer().deserialize( entry.getValue()));
					}
					return mapdetail;
				}
				return null;
			}
		});

	}

	@Override
	public String getMapRow(final String key, final String row) {
		return redisTemplate.execute(new RedisCallback<String>() {
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] keyb = redisTemplate.getStringSerializer().serialize(key);
				if (connection.exists(keyb)) {
					byte[] value = connection.hGet(keyb,redisTemplate.getStringSerializer().serialize(row));
					return redisTemplate.getStringSerializer().deserialize(value);
				}
				return null;
			}
		});
	}

	@Override
	public List<String> getListValue(final String key) {
		return redisTemplate.execute(new RedisCallback<List<String>>() {
			public List<String> doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] keyb = redisTemplate.getStringSerializer().serialize(key);
				if (connection.exists(keyb)) {
					List<byte[]> lvs=connection.lRange(keyb,0,-1);
					List<String> detail = new ArrayList<String>();
					int icount=lvs.size();
					for (int ii=0;ii<icount;ii++) {
						detail.add(redisTemplate.getStringSerializer().deserialize(lvs.get(ii))+"");
					}
					return detail;
				}
				return null;
			}
		});
	}

	@Override
	public int saveMapValue(final String key, final Map<String, String> map, final int expire) {
		redisTemplate.execute(new RedisCallback<Object>() {
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] keyb = redisTemplate.getStringSerializer().serialize(key);
				Iterator<Map.Entry<String, String>> ite = map.entrySet().iterator();
				while (ite.hasNext()) {
					Map.Entry<String, String> entry = ite.next();
					String k = entry.getKey();
					String v =entry.getValue();
					connection.hSet(keyb,redisTemplate.getStringSerializer().serialize(k),redisTemplate.getStringSerializer().serialize(v));
				}
				if (expire>0){connection.expire(keyb,expire);};
				return null;
			}
		});
		return 1;
	}

	@Override
	public int removeMapRow(final String key, final String value) {
		redisTemplate.execute(new RedisCallback<Object>() {
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] keyb = redisTemplate.getStringSerializer().serialize(key);
				connection.hDel(keyb,redisTemplate.getStringSerializer().serialize(value));
				return null;
			}
		});
		return 1;
	}

	@Override
	public int saveListValue(final String key, final List<String> list, final int expire) {
		redisTemplate.execute(new RedisCallback<Object>() {
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] keyb = redisTemplate.getStringSerializer().serialize(key);
				for (int i = 0; i < list.size(); i++) {
					connection.lPush(keyb,redisTemplate.getStringSerializer().serialize(list.get(i)));
				}
				if (expire>0){connection.expire(keyb,expire);};
				return null;
			}
		});
		return 1;

	}

	@Override
	public int removeListRow(final String key, final String value) {
		redisTemplate.execute(new RedisCallback<Object>() {
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] keyb = redisTemplate.getStringSerializer().serialize(key);
				connection.lRem(keyb, 0,redisTemplate.getStringSerializer().serialize(value));
				return null;
			}
		});
		return 1;
	}

	@Override
	public int saveListRow(final String key, final String value) {
		redisTemplate.execute(new RedisCallback<Object>() {
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] keyb = redisTemplate.getStringSerializer().serialize(key);
				connection.lPush(keyb,redisTemplate.getStringSerializer().serialize(value));
				return null;
			}
		});
		return 1;
	}

	@Override
	public int saveMapRow(final String key,final String row,final String value) {
		redisTemplate.execute(new RedisCallback<Object>() {
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] keyb = redisTemplate.getStringSerializer().serialize(key);
				connection.hSet(keyb,redisTemplate.getStringSerializer().serialize(row),redisTemplate.getStringSerializer().serialize(value));
				return null;
			}
		});
		return 1;
	}

	@Override
	public int clearredisdb() {
		redisTemplate.execute(new RedisCallback<Object>() {
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				connection.flushDb();
				return null;
			}
		});
		return 1;
	}


}
