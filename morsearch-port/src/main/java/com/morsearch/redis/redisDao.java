package com.morsearch.redis;

import java.io.Serializable;

import com.morsearch.model.Sys_User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class redisDao {

	@Autowired
	protected RedisTemplate<Serializable, Serializable> redisTemplate;

/*新增*/
	public void saveUser(final Sys_User user) {
		redisTemplate.execute(new RedisCallback<Object>() {
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				connection.set(redisTemplate.getStringSerializer().serialize("uc.user.info.uid." +user.getUr_id() + ""),
						redisTemplate.getStringSerializer().serialize(user.getUr_no()));
				return null;
			}
		});
	}

	/*删除*/
	public Integer deleteUser(final long id) {
		return redisTemplate.execute(new RedisCallback<Integer>() {
			public Integer doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] key = redisTemplate.getStringSerializer().serialize(id + "");
				connection.del(key);
				return 0;
			}
		});
	}

/*检验*/
	public Boolean checkUser(final long id) {
		return redisTemplate.execute(new RedisCallback<Boolean>() {
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] key = redisTemplate.getStringSerializer().serialize("uc.user.info.uid." +id + "");
				return  connection.exists(key);
			}
		});
	}

/*读取*/
	public Sys_User getUser(final long id) {
		return redisTemplate.execute(new RedisCallback<Sys_User>() {
			public Sys_User doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] key = redisTemplate.getStringSerializer().serialize("uc.user.info.uid." +id + "");
				if (connection.exists(key)) {
					byte[] value = connection.get(key);
					String name = redisTemplate.getStringSerializer().deserialize(value);
					Sys_User user = new Sys_User();
					user.setUr_no(name);
					user.setUr_id(id);
					return user;
				}
				return null;
			}

		});
	}









}
