package com.morsearch.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class SequenceCreator {


	/*生成单据编号*/
	public static String createnumber(String  prefix,int strlen) {
		if (strlen<=2){strlen=4;};
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddHHmmss");
		StringBuilder sb = new StringBuilder();
		sb.append(prefix);
		sb.append(sdf.format(date));
		sb.append(getRandomStr(strlen));
		return sb.toString();
	}


	/**
	 * 生成指定长度的随机数字串
	 * 
	 * @param length
	 * @return
	 */
	public static String getRandomStr(int length) {
		int max = 9;
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int s = random.nextInt(max);
			sb.append(s);
		}
		return sb.toString();
	}

	/**
	 * 生成新文件名
	 * 
	 * @return
	 */
	public static String createNewFileName() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddHHmmss");
		StringBuilder sb = new StringBuilder();
		sb.append(sdf.format(date));
		sb.append(getRandomStr(4));// 获取4位随机数
		return sb.toString();
	}

}
