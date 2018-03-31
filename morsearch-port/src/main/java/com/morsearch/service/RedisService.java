package com.morsearch.service;

import com.morsearch.model.Acc_Buy;

import java.util.List;
import java.util.Map;


/*Redis service
*
* */

public interface RedisService {
	boolean checkValue(String key);/*检查key值*/
	//boolean checkMapValue(String key,String row);/*检查key值*/
	int deleteValue(String key);/*删除key值*/

	String getStringValue(String key);/*获取redis的String类*/
	Map<String, String> getMapValue(String key);/*获取redis的Map类*/
	String getMapRow(String key, String row);/*获取redis的Map类的记录*/
	List<String> getListValue(String key);/*获取redis的List类*/

	int saveStringValue(String key, String Value, int expire);/*保存redis的String类*/
	int saveMapValue(String key, Map<String, String> map, int expire);/*保存redis的Map类*/
	int removeMapRow(String key, String value);/*移除redis的map类的row*/

	int saveListValue(String key, List<String> list, int expire);/*保存redis的List类*/
	int removeListRow(String key, String value);/*移除redis的list类的row*/
	int saveListRow(String key, String value);/*保存redis的list类的row expire放在大类*/

	int saveMapRow(String key, String row, String value);/*保存redis的Map类的记录 expire放在大类*/

	int clearredisdb();/*清除redisdb*/

}
