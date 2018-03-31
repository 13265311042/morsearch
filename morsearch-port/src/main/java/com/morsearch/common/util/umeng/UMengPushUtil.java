
/** 
 * Filename:    UMengPushUtil.java
 * Description:
 * Company:    renrenmoney
 * @author ywh
 * @param @throws Exception
 * @return void
 */
package com.morsearch.common.util.umeng;

import java.util.HashMap;
import java.util.Map;

import com.morsearch.common.constant.Constants;
import org.json.JSONArray;
import org.json.JSONObject;


public class UMengPushUtil {
	
/*
	private String appkey = null;
	private String appMasterSecret = null;
*/

	private static final String PUSH_ANDROID_APPKEY = "59c9f5548f4a9d2c2200045b";
	private static final String PUSH_ANDROID_UMENG_MESSAGE_SECRET = "20f4e4292454f9d89c3eda6970fef3e2";
	private static final String PUSH_ANDROID_APP_MASTER_SECRET = "pbkzwxhuaybrim4eqncmv8rhdmwgw1uy";
	private static final String PUSH_IOS_APPKEY = "5a39ddd18f4a9d6b7900008c";
	private static final String PUSH_IOS_APP_MASTER_SECRET = "rtqgifxz8cfkgjpbubvbdhfaoahqvyoe";
	private static final Boolean PUSH_TEST_FLAG=true;



/*
	"type":"xx",            // 必填 消息发送类型,其值可以为:
	unicast-单播
	listcast-列播(要求不超过500个device_token)
	filecast-文件播
			(多个device_token可通过文件形式批量发送）
					broadcast-广播
					groupcast-组播
					(按照filter条件筛选特定用户群, 具体请参照filter参数)
	customizedcast(通过开发者自有的alias进行推送),
	包括以下两种case:
			- alias: 对单个或者多个alias进行推送
	- file_id: 将alias存放到文件后，根据file_id来推送
	"alias_type": "xx"      // 可选 当type=customizedcast时，必填，alias的类型,
	alias_type可由开发者自定义,开发者在SDK中
	调用setAlias(alias, alias_type)时所设置的alias_type
	"alias":"xx",           // 可选 当type=customizedcast时, 开发者填写自己的alias。
	要求不超过50个alias,多个alias以英文逗号间隔。
	在SDK中调用setAlias(alias, alias_type)时所设置的alias
自定义：

		unicast.setPredefinedKeyValue("start_time", "2017-12-18 15:50:00");
		unicast.setPredefinedKeyValue("play_sound", "false");  // 可选 收到通知是否发出声音,默认为"true"
		unicast.setPredefinedKeyValue("play_vibrate", "true");  // 可选 收到通知是否震动,默认为"true".
		unicast.setPredefinedKeyValue("play_lights", "true");  // 可选 收到通知是否闪灯,默认为"true"
        "after_open": "xx" // 必填 值可以为:
                                   "go_app": 打开应用
                                   "go_url": 跳转到URL
                                   "go_activity": 打开特定的activity
                                   "go_custom": 用户自定义内容。
        "url": "xx",       // 可选 当"after_open"为"go_url"时，必填。
                                   通知栏点击后跳转的URL，要求以http或者https开头
        "activity":"xx",   // 可选 当"after_open"为"go_activity"时，必填。
                                   通知栏点击后打开的Activity
        "custom":"xx"/{}   // 可选 display_type=message, 或者
                                   display_type=notification且
                                   "after_open"为"go_custom"时，
                                   该字段必填。用户自定义内容, 可以为字符串或者JSON格式。

*/

/*
	public UMengPushUtil(String _appkey, String _appMasterSecret) {
		try {
			appkey = _appkey;
			appMasterSecret = _appMasterSecret;
			timestamp = Integer.toString((int)(System.currentTimeMillis() / 1000));
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
*/

	
/*
	public static UMengPushUtil getInstance(String _appkey, String _appMasterSecret) {
		return new UMengPushUtil(_appkey, _appMasterSecret);
	}
*/

	/**
	 * 
	 * @Title: sendIOSBroadcast
	 * @Description: iOS广播推送，所有用户接收消息
	 * @author ywh
	 * @param @throws Exception
	 * @return void
	 */
	public void sendIOSBroadcast(String title,String content) throws Exception {
		String timestamp = Integer.toString((int)(System.currentTimeMillis() / 1000));

		IOSBroadcast broadcast = new IOSBroadcast();
		broadcast.setAppMasterSecret(PUSH_IOS_APP_MASTER_SECRET);
		broadcast.setPredefinedKeyValue("appkey",PUSH_IOS_APPKEY);
		broadcast.setPredefinedKeyValue("timestamp", timestamp);

		broadcast.setPredefinedKeyValue("badge", 0);
		broadcast.setPredefinedKeyValue("sound", "chime");
		broadcast.setPredefinedKeyValue("title",title); //title
		broadcast.setPredefinedKeyValue("body", content);

		// TODO set 'production_mode' to 'true' if your app is under production mode
		broadcast.setPredefinedKeyValue("production_mode", PUSH_TEST_FLAG==true?"true":"false");//正式环境//测试环境
		// Set customized fields
		broadcast.setCustomizedField("test", "helloworld");
		broadcast.send();
	}
	
	/**
	 * 
	 * @Title: sendIOSUnicast
	 * @Description: iOS点对点推送，针对单个用户
	 * @author ywh
	 * @param @throws Exception
	 * @return void
	 */
	public void sendIOSUnicast(String deviceToken,String title, String content) throws Exception {
		String timestamp = Integer.toString((int)(System.currentTimeMillis() / 1000));

		IOSUnicast unicast = new IOSUnicast();
		unicast.setAppMasterSecret(PUSH_IOS_APP_MASTER_SECRET);
		unicast.setPredefinedKeyValue("appkey",PUSH_IOS_APPKEY );
		unicast.setPredefinedKeyValue("timestamp",timestamp);
		// TODO Set your device token
		unicast.setPredefinedKeyValue("device_tokens", deviceToken);
		unicast.setPredefinedKeyValue("badge", 0);
		unicast.setPredefinedKeyValue("sound", "chime");
		unicast.setPredefinedKeyValue("title",title);
		unicast.setPredefinedKeyValue("body", content);

		// TODO set 'production_mode' to 'true' if your app is under production mode
		unicast.setPredefinedKeyValue("production_mode", PUSH_TEST_FLAG==true?"true":"false");//正式环境//测试环境
		// Set customized fields
		unicast.setCustomizedField("test", "helloworld");
		unicast.send();
	}
	
	/**
	 * 
	 * @Title: sendIOSGroupcast
	 * @Description: iOS分组推送
	 * @author ywh
	 * @param @throws Exception
	 * @return void
	 */
	public void sendIOSGroupcast(String title,String content, Map<String, String> tagMap) throws Exception {
		String timestamp = Integer.toString((int)(System.currentTimeMillis() / 1000));

		IOSGroupcast groupcast = new IOSGroupcast();
		groupcast.setAppMasterSecret(PUSH_IOS_APP_MASTER_SECRET);
		groupcast.setPredefinedKeyValue("appkey",PUSH_IOS_APPKEY );
		groupcast.setPredefinedKeyValue("timestamp",timestamp);
		/*  TODO
		 *  Construct the filter condition:
		 *  "where": 
		 *	{
    	 *		"and": 
    	 *		[
      	 *			{"tag":"iostest"}
    	 *		]
		 *	}
		 */
		JSONObject filterJson = new JSONObject();
		JSONObject whereJson = new JSONObject();
		JSONArray tagArray = new JSONArray();
		
		JSONObject planTag = new JSONObject();
		if(tagMap.containsKey("PLAN")) {
			planTag.put("tag", "PLAN");
			tagArray.put(planTag);
			groupcast.setCustomizedField("rrjctype", "plan");
		}
		
		JSONObject borrowTag = new JSONObject();
		if(tagMap.containsKey("BORROW")) {
			borrowTag.put("tag", "BORROW");
			tagArray.put(borrowTag);
			groupcast.setCustomizedField("rrjctype", "borrow");
		}
		
		JSONObject debtTag = new JSONObject();
		if(tagMap.containsKey("DEBT")) {
			debtTag.put("tag", "DEBT");
			tagArray.put(debtTag);
			groupcast.setCustomizedField("rrjctype", "debt");
		}
		
		whereJson.put("and", tagArray);
		filterJson.put("where", whereJson);
		System.out.println(filterJson.toString());
		
		// Set filter condition into rootJson
		groupcast.setPredefinedKeyValue("filter", filterJson);
		groupcast.setPredefinedKeyValue("badge", 0);
		groupcast.setPredefinedKeyValue("sound", "chime");
		groupcast.setPredefinedKeyValue("title",title);
		groupcast.setPredefinedKeyValue("body", content);
		// TODO set 'production_mode' to 'true' if your app is under production mode
		groupcast.setPredefinedKeyValue("production_mode", PUSH_TEST_FLAG==true?"true":"false");//正式环境//测试环境

		groupcast.send();
	}
	
	/**
	 * 
	 * @Title: sendAndroidGroupcast
	 * @Description: android分组推送
	 * @author ywh
	 * @param @throws Exception
	 * @return void
	 */
	public void sendAndroidGroupcast(String title, String content, Map<String, String> tagMap) throws Exception {
		String timestamp = Integer.toString((int)(System.currentTimeMillis() / 1000));

		AndroidGroupcast groupcast = new AndroidGroupcast();
		groupcast.setAppMasterSecret(PUSH_ANDROID_APP_MASTER_SECRET);
		groupcast.setPredefinedKeyValue("appkey",PUSH_ANDROID_APPKEY);
		groupcast.setPredefinedKeyValue("timestamp",timestamp);
		JSONObject filterJson = new JSONObject();
		JSONObject whereJson = new JSONObject();
		JSONArray tagArray = new JSONArray();
		
		JSONObject planTag = new JSONObject();
		if(tagMap.containsKey("PLAN")) {
			planTag.put("tag", "PLAN");
			tagArray.put(planTag);
			groupcast.setExtraField("rrjctype", "plan");
		}
		
		JSONObject borrowTag = new JSONObject();
		if(tagMap.containsKey("BORROW")) {
			borrowTag.put("tag", "BORROW");
			tagArray.put(borrowTag);
			groupcast.setExtraField("rrjctype", "borrow");
		}
		
		JSONObject debtTag = new JSONObject();
		if(tagMap.containsKey("DEBT")) {
			debtTag.put("tag", "DEBT");
			tagArray.put(debtTag);
			groupcast.setExtraField("rrjctype", "debt");
		}

		whereJson.put("and", tagArray);
		filterJson.put("where", whereJson);
		System.out.println(filterJson.toString());
		
		groupcast.setPredefinedKeyValue("filter", filterJson);
		groupcast.setPredefinedKeyValue("ticker", title);
		groupcast.setPredefinedKeyValue("title",  title);
		groupcast.setPredefinedKeyValue("text",   content);
		groupcast.setPredefinedKeyValue("after_open", "go_app");
		groupcast.setPredefinedKeyValue("display_type", "notification");
		// TODO Set 'production_mode' to 'false' if it's a test device. 
		// For how to register a test device, please see the developer doc.
		groupcast.setPredefinedKeyValue("production_mode", PUSH_TEST_FLAG==true?"true":"false");//正式环境//测试环境

		groupcast.send();
	}

	/**
	 * 安卓广播推送
	 * @param title
	 * @param content
	 * @throws Exception
     */
	public void sendAndroidBroadcast(String title, String content) throws Exception {
		String timestamp = Integer.toString((int)(System.currentTimeMillis() / 1000));

		AndroidBroadcast broadcast = new AndroidBroadcast();
		broadcast.setAppMasterSecret(PUSH_ANDROID_APP_MASTER_SECRET);
		broadcast.setPredefinedKeyValue("appkey",PUSH_ANDROID_APPKEY);
		broadcast.setPredefinedKeyValue("timestamp",timestamp);
		broadcast.setPredefinedKeyValue("ticker",Constants.PUSH_DEFAULT_TICKER);
		broadcast.setPredefinedKeyValue("title",  title);
		broadcast.setPredefinedKeyValue("text",   content);
		broadcast.setPredefinedKeyValue("after_open", "go_app");
		broadcast.setPredefinedKeyValue("display_type", "notification");
		// TODO Set 'production_mode' to 'false' if it's a test device.
//		broadcast.setPredefinedKeyValue("production_mode", Constants.PUSH_TEST_FLAG==true?"true":"false");//正式环境//测试环境
		// For how to register a test device, please see the developer doc.
//		if(DeployManager.isdev == 1) {
//			broadcast.setPredefinedKeyValue("production_mode", "false");
//		} else if(DeployManager.isdev == 8){
//			broadcast.setPredefinedKeyValue("production_mode", "true");
//		}
		// Set customized fields
	//	broadcast.setExtraField("test", "helloworld");
		broadcast.send();
	}

	/**
	 * 安卓单点推送
	 * @param deviceToken
	 * @param title
	 * @param content
     * @throws Exception
     */
	public void sendAndroidUnicast(String deviceToken, String title, String content) throws Exception {
		String timestamp = Integer.toString((int)(System.currentTimeMillis() / 1000));

		AndroidUnicast unicast = new AndroidUnicast();
		unicast.setAppMasterSecret(PUSH_ANDROID_APP_MASTER_SECRET);
		unicast.setPredefinedKeyValue("appkey",PUSH_ANDROID_APPKEY);
		unicast.setPredefinedKeyValue("timestamp",timestamp);
		// TODO Set your device token
		unicast.setPredefinedKeyValue("device_tokens", deviceToken);
		unicast.setPredefinedKeyValue("ticker", "Android unicast ticker");
		unicast.setPredefinedKeyValue("title",  title);
		unicast.setPredefinedKeyValue("text",   content);
		unicast.setPredefinedKeyValue("after_open", "go_app");
		unicast.setPredefinedKeyValue("display_type", "notification");
		// TODO Set 'production_mode' to 'false' if it's a test device. 
		// For how to register a test device, please see the developer doc.
		unicast.setPredefinedKeyValue("production_mode", PUSH_TEST_FLAG==true?"true":"false");//正式环境//测试环境
		// Set customized fields
	//	unicast.setExtraField("test", "helloworld");
		unicast.send();
	}


	/**
	 * 安卓单点别名推送
	 * @param
	 * @param ticker APP提示语
	 * @param aliastype  别名类别
	 * @param alias  别名
	 * @param title  标题
	 * @param content  内容
	 * @param strcustom  自定义行为
	 * @param mmap 需要替换的主内容
	 * @throws Exception
	 */
	public static String sendAndroidAlias(String ticker,String aliastype, String alias, String title, String content, String strcustom
			, Map<String, String> mmap) throws Exception {
		String timestamp = Integer.toString((int)(System.currentTimeMillis() / 1000));

		AndroidUnicast unicast = new AndroidUnicast();
		unicast.setAppMasterSecret(PUSH_ANDROID_APP_MASTER_SECRET);
		unicast.setPredefinedKeyValue("appkey",PUSH_ANDROID_APPKEY);
		unicast.setPredefinedKeyValue("timestamp", timestamp);
		// TODO Set your device token
		unicast.setPredefinedKeyValue("type", "customizedcast");
		unicast.setPredefinedKeyValue("alias", alias);
		unicast.setPredefinedKeyValue("alias_type",aliastype);
		unicast.setPredefinedKeyValue("ticker",ticker);
		unicast.setPredefinedKeyValue("title",  title);
		unicast.setPredefinedKeyValue("text",   content);
		unicast.setPredefinedKeyValue("after_open", "go_app");
		unicast.setPredefinedKeyValue("display_type", "notification");
		unicast.setPredefinedKeyValue("production_mode", PUSH_TEST_FLAG==true?"true":"false");//正式环境//测试环境
		unicast.setPredefinedKeyValue("play_sound", "false");  // 可选 收到通知是否发出声音,默认为"true"

		if (strcustom!=null&&!"".equals(strcustom)){ /*自定义行为*/
/*
			unicast.setPredefinedKeyValue("after_open", "go_custom");
			unicast.setPredefinedKeyValue("custom",strcustom);
*/
			String[] st=strcustom.split(";");
			String strs="",skey,svalue;
			for(int ii=0;ii<st.length;ii++) {
				strs=st[ii];
				skey=strs.substring(0,strs.indexOf(":"));
				svalue=strs.substring(strs.indexOf(":")+1,strs.length());
				unicast.setExtraField(skey,svalue);
			};



		};
/*解析自定义
*
* */
		if (mmap!=null&&mmap.size()>0) {
			for (String mkey : mmap.keySet()) {
				unicast.setPredefinedKeyValue(mkey, mmap.get(mkey));
			};
		};
/*自定义参数
*可选 用户自定义key-value。只对"通知"(display_type=notification)生效。
可以配合通知到达后,打开App,打开URL,打开Activity使用。
* */
/*
		if (extramap!=null&&extramap.size()>0) {
			JSONObject obj=new JSONObject(extramap);
			unicast.setExtraField("extra",obj.toString());
		};
*/
		return unicast.send();
	}

	/**
	 * IOS单点别名推送
	 * @param
	 * @param aliastype  别名类别
	 * @param alias  别名
	 * @param title  标题
	 * @param content  内容
	 * @param strcustom  自定义行为
	 * @param mmap 需要替换的主内容
	 * @throws Exception
	 */
	public static String sendIOSAlias(String aliastype, String alias, String title, String content, String strcustom
			, Map<String, String> mmap) throws Exception {
		String timestamp = Integer.toString((int)(System.currentTimeMillis() / 1000)+120);

		IOSUnicast unicast = new IOSUnicast();
		unicast.setAppMasterSecret(PUSH_IOS_APP_MASTER_SECRET);
		unicast.setPredefinedKeyValue("appkey",PUSH_IOS_APPKEY );
		unicast.setPredefinedKeyValue("timestamp", timestamp);
		unicast.setPredefinedKeyValue("badge", 0);
		unicast.setPredefinedKeyValue("sound", "chime");

		unicast.setPredefinedKeyValue("type", "customizedcast");
		unicast.setPredefinedKeyValue("alias", alias);
		unicast.setPredefinedKeyValue("alias_type",aliastype);
		unicast.setPredefinedKeyValue("title",title); //title
		unicast.setPredefinedKeyValue("body", content);

		unicast.setPredefinedKeyValue("production_mode","false" );//正式环境 PUSH_TEST_FLAG==true?"true":"false"//测试环境

		if (strcustom!=null&&!"".equals(strcustom)){
/*自定义行为*/
			String[] st=strcustom.split(";");
			String strs="",skey,svalue;
			for(int ii=0;ii<st.length;ii++) {
				strs=st[ii];
				skey=strs.substring(0,strs.indexOf(":"));
				svalue=strs.substring(strs.indexOf(":")+1,strs.length());
				unicast.setCustomizedField(skey,svalue);
			};
/*
			unicast.setPredefinedKeyValue("after_open", "go_custom");
			unicast.setPredefinedKeyValue("custom",strcustom);
*/
		};


/*解析自定义
*
* */
		if (mmap!=null&&mmap.size()>0) {
			for (String mkey : mmap.keySet()) {
				unicast.setPredefinedKeyValue(mkey, mmap.get(mkey));
			};
		};
/*自定义参数
*可选 用户自定义key-value。只对"通知"(display_type=notification)生效。
可以配合通知到达后,打开App,打开URL,打开Activity使用。
* */
/*
		if (extramap!=null&&extramap.size()>0) {
			JSONObject obj=new JSONObject(extramap);
			unicast.setCustomizedField("extra",obj.toString());
		};
*/
		return unicast.send();
	}


}


