package com.morsearch.mongo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * mongodb配置文件读取工具类
 * @author shimingbo
 * @since 2017/6/8
 */
public class MonogoDBSetting {

	private static Properties props;

	static {
		props = new Properties();
		InputStream propIn = Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties");
		try {
			props.load(propIn);
		} catch (IOException e) {				
			e.printStackTrace();
		}
		//readProperties(propFile);
	}
	public static String getSetting(String key) {
		return props.getProperty(key);
	}

	public static String getSetting(String key, String defVal) {
		String rtn = props.getProperty(key);
		if (rtn == null || rtn.length() == 0) {
			return defVal;
		}
		return rtn;
	}





}
