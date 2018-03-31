package com.morsearch.common.util;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.morsearch.common.constant.Constants;
import com.morsearch.vo.AppResult;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Decoder;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class CommonUtil {
	
	// 默认除法运算精度
	private static final int DEF_DIV_SCALE = 10;




	/**
	 * String转换double
	 * 
	 * @param
	 * @return double
	 */
	public static double convertSourData(String dataStr) throws Exception {
		if (dataStr != null && !"".equals(dataStr)) {
			return Double.valueOf(dataStr);
		}
		throw new NumberFormatException("convert error!");
	}

	/**
	 * 判断变量是否为空
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isEmpty(String s) {
		if (null == s || "".equals(s) || "".equals(s.trim()) || "null".equalsIgnoreCase(s.toLowerCase())) {
			return true;
		} else {
			return false;
		}
	}


	/**
	 * 判断对象或对象数组中每一个对象是否为空: 对象为null，字符序列长度为0，集合类、Map为empty
	 *
	 * @param obj
	 * @return true or false
	 */
	public static boolean isNullOrEmpty(Object obj) {
		if (obj == null) return true;
		if (obj instanceof CharSequence) return ((CharSequence) obj).length() == 0;
		if (obj instanceof Collection) return ((Collection<?>) obj).isEmpty();
		if (obj instanceof Map) return ((Map<?, ?>) obj).isEmpty();
		if (obj instanceof Object[]) {
			Object[] object = (Object[]) obj;
			if (object.length == 0) {
				return true;
			}
			boolean empty = true;
			for (int i = 0; i < object.length; i++) {
				if (!isNullOrEmpty(object[i])) {
					empty = false;
					break;
				}
			}
			return empty;
		}
		if ("".equals(obj)) return true;
		return false;
	}

	/**
	 * 判断变量是否为布尔
	 *
	 * @param
	 * @return
	 */
	public static boolean isBool(String str){
		Boolean rut=false;
		if (str==null||"".equals(str)){rut=true;};
		if ("false".equals(str.toLowerCase())||"true".equals(str.toLowerCase())||
				"1".equals(str.toLowerCase())||"0".equals(str.toLowerCase())){rut=true;};
		return rut;
	}


	/**
	 * 判断变量是否为数字
	 *
	 * @param
	 * @return
	 */
	public static boolean isNumeric(String str){
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i)=='.'){continue;};/*小数点*/
			if (!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
		return true;
	}

	/**
	 * 获取IP地址
	 *
	 * @param request
	 * @return ip地址
	 */
	public static String getIpAddress(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	/**
	 * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到 小数点以后10位，以后的数字四舍五入。
	 * 
	 * @param v1
	 *            被除数
	 * @param v2
	 *            除数
	 * @return 两个参数的商
	 */
	public static double div(double v1, double v2) {
		return div(v1, v2, DEF_DIV_SCALE);
	}
	/**
	 * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指 定精度，以后的数字四舍五入。
	 * 
	 * @param v1
	 *            被除数
	 * @param v2
	 *            除数
	 * @param scale
	 *            表示表示需要精确到小数点以后几位。
	 * @return 两个参数的商
	 */
	public static double div(double v1, double v2, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

/*数据格式转换
	leoli 2017.09.29
* */
	public static String datatype_convert(HttpServletRequest request,String content) {
		String datatype=((String)request.getParameter("datatype")); /*查格式*/
		/*json转jsonp*/
		String jsonp_callback=((String)request.getParameter("jsonp_callback"));/*前端定义名称*/
		if ("jsonp".equals(datatype)||jsonp_callback!=null) {
			content = jsonp_callback + "(" + content + ");";
		};
		return content;
	};


/*接口返回错误信息*/
//	private Logger logger = Logger.getLogger(getClass());
	public static void getApiMsgFail(HttpServletRequest request, HttpServletResponse response,String Msg,String ErrCode) throws Exception {
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
		Logger logger = Logger.getLogger(request.getClass());

		PrintWriter out = ControllerUtils.getPrintWriter(response, logger, "----");
		AppResult appresult=new AppResult();
		appresult.setStatus(Constants.RESULT_STATUS_FAIL);
		appresult.setMessage(Msg);
		appresult.setErrorcode(ErrCode);
		out.print(CommonUtil.datatype_convert(request,gson.toJson(appresult)));
		out.close();
	};



	/*String convert Boolean
        leoli 2017.10.11
    * */
	public static Boolean convert_boolean(String str) {
		if (str==null){return null;};
		if ("".equals(str.trim()) || "null".equals(str.toLowerCase())){return null;};
		Boolean bl=null;
		if (("1".equals(str)||"true".equals(str.toLowerCase()))){
			bl=true;
		};
		if (("0".equals(str)||"false".equals(str.toLowerCase()))){
			bl=false;
		};
		return  bl;
	}

	/*String convert Byte
        leoli 2017.10.27
    * */
	public static Byte convert_Byte(String str) {
		if (str==null){return null;};
		if ("".equals(str.trim()) || "null".equals(str.toLowerCase())){return null;};
		return  Byte.valueOf(str);
	}

	public static long convert_Long(String str) {
		if (str==null){return 0;};
		if ("".equals(str.trim()) || "null".equals(str.toLowerCase())){return 0;};
		return Long.parseLong(str);
	}

	public static Integer convert_Int(String str) {
		if (str==null){return 0;};
		if ("".equals(str.trim()) || "null".equals(str.toLowerCase())){return 0;};
		return Integer.parseInt(str);
	}

	public static BigDecimal convert_bigdecimal(String str) {
		BigDecimal bd=new BigDecimal(0);
		if (str==null){return bd;};
		if ("".equals(str.trim()) || "null".equals(str.toLowerCase())){return bd;};
		return  new BigDecimal(str);
	}

	public static Boolean read_boolean(Boolean bl) {
		if (bl==null){bl=false;};
		return  bl;
	}


	public static Integer read_int(Integer ig) {
		if (ig==null){ig=0;};
		return  ig;
	}

	public static Byte read_byte(Byte ig) {
		if (ig==null){ig=0;};
		return  ig;
	}

	public static Long read_long(Long ig) {
		if (ig==null){ig=0L;};
		return  ig;
	}

	public static String read_str(String sg) {
		if (sg==null){sg="";};
		return  sg;
	}

/*读取BigDecimal数据，为空时置为0*/
	public static BigDecimal read_decimal(BigDecimal bd) {
		if (bd==null){bd=new BigDecimal(0);};
		return  bd;
	}


/*用于查询数据库的真假值，布尔值转为sql的0和1,并加ifnull(field,0)*/
	public static String read_dbbit(String bb) {
		if (bb==null){return null;};
		if (bb!=null && "false".equals(bb.toLowerCase())){return "0";};
		if (bb!=null && "true".equals(bb.toLowerCase())){return "1";};
		return  bb;
	}

/*保存图片*/
	public static boolean savePhoto(String path, String photo, String fileNewName) {
		boolean isSuccess = true;
		try {
			BASE64Decoder decoder = new BASE64Decoder();
			byte[] bytes = decoder.decodeBuffer(photo);
			BufferedOutputStream stream = null;
			File file = null;
			try {
				file = new File(path + "/" + fileNewName);
				System.out.println(file.getAbsolutePath());
				if (!file.exists()) {
					file.createNewFile();
				}
				//final FileOutputStream fstream = new FileOutputStream(file);
				FileInputStream input = new FileInputStream(file);
				Properties p = new Properties();
				InputStream is = null;
				is=Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
				p.load(is);
				String ADDRESS = p.getProperty("FTP_ADDRESS");
				String PORT = p.getProperty("FTP_PORT");
				String USERNAME = p.getProperty("FTP_USERNAME");
				String PASSWORD = p.getProperty("FTP_PASSWORD");
				FtpUtil.uploadFile(ADDRESS,  Integer.parseInt(PORT), USERNAME, PASSWORD, "images", fileNewName,input);
			} catch (final Exception e) {
				isSuccess = false;
				e.printStackTrace();
			} finally {
				if (stream != null) {
					try {
						stream.close();
					} catch (final Exception e) {
						e.printStackTrace();
					}
				}
			}
			if (isSuccess) {
			ImageTools.scaleImageL(path + "/" + fileNewName,path + "/small/" + fileNewName,30);
			}

		} catch (Exception e) {
			e.printStackTrace();
			isSuccess = false;
		}
		return isSuccess;
	}


/*获取UUID值*/
	public static String getUUID(boolean flag) {
        String str = UUID.randomUUID().toString();
		if (flag==true) {str =str.replace("-", "");};/*去掉"-"符号*/
		return str;//UUID.randomUUID().toString().replace("-", "");
	}

/*时间查询获取的值*/
	public static Date queryTime1(String time1, String time2) throws ParseException {//返回time
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if(CommonUtil.isEmpty(time1)&&CommonUtil.isEmpty(time2)){
			return null;
		}
		if(CommonUtil.isEmpty(time1)&&!CommonUtil.isEmpty(time2)){
			return sdf.parse("2000-11-11");
		}
		if(!CommonUtil.isEmpty(time1)&&CommonUtil.isEmpty(time2)){
			return sdf.parse(time1);
		}

		if(!CommonUtil.isEmpty(time1)&&!CommonUtil.isEmpty(time2)){
			return sdf.parse(time1);
		}
		return null;
	}
	/*时间查询获取的值*/
	public static Date queryTime2(String time1, String time2) throws ParseException {//返回time2
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = new GregorianCalendar();
		if(CommonUtil.isEmpty(time1)&&CommonUtil.isEmpty(time2)){
			return null;
		}
		if(CommonUtil.isEmpty(time1)&&!CommonUtil.isEmpty(time2)){
			calendar.setTime(sdf.parse(time2));
			calendar.add(calendar.DATE,1);//往后加一天

			return calendar.getTime();
		}
		if(!CommonUtil.isEmpty(time1)&&CommonUtil.isEmpty(time2)){
			return sdf.parse("2099-11-11");
		}

		if(!CommonUtil.isEmpty(time1)&&!CommonUtil.isEmpty(time2)){
			calendar.setTime(sdf.parse(time2));
			calendar.add(calendar.DATE,1);//往后加一天
			return calendar.getTime();
		}
		return null;
	}


/*BeanMap进行对象与Map的相互转换 begin
*架包       <dependency>
          <groupId>com.google.guava</groupId>
          <artifactId>guava</artifactId>
          <version>21.0</version>
      </dependency>
* */
	/*将List<T>转换为List<Map<String, Object>> */
	public static <T> List<Map<String, Object>> objectsToMaps(List<T> objList) {
		List<Map<String, Object>> list = Lists.newArrayList();
		if (objList != null && objList.size() > 0) {
			Map<String, Object> map = null;
			T bean = null;
			for (int i = 0,size = objList.size(); i < size; i++) {
				bean = objList.get(i);
				map = beanToMap(bean);
				list.add(map);
			}
		}
		return list;
	}


/* 将List<Map<String,Object>>转换为List<T>*/

	public static <T> List<T> mapsToObjects(List<Map<String, Object>> maps,Class<T> clazz) throws InstantiationException, IllegalAccessException {
		List<T> list = Lists.newArrayList();
		if (maps != null && maps.size() > 0) {
			Map<String, Object> map = null;
			T bean = null;
			for (int i = 0,size = maps.size(); i < size; i++) {
				map = maps.get(i);
				bean = clazz.newInstance();
				mapToBean(map, bean);
				list.add(bean);
			}
		}
		return list;
	}

	/** 将对象装换为map */

	public static <T> Map<String, Object> beanToMap(T bean) {
		Map<String, Object> map = Maps.newHashMap();
		if (bean != null) {
			BeanMap beanMap = BeanMap.create(bean);
			for (Object key : beanMap.keySet()) {
				map.put(key+"", beanMap.get(key));
			}
		}
		return map;
	}

	/**将map装换为javabean对象*/
	public static <T> T mapToBean(Map<String, Object> map,T bean) {
		BeanMap beanMap = BeanMap.create(bean);
		beanMap.putAll(map);
		return bean;
	}


/*BeanMap进行对象与Map的相互转换 end*/

/*密码二次加密 leoli*/

	public static String pwdmd5t2(String pwd) {
		String rut="";
		if (pwd==null||"".equals(pwd.trim())){return rut;};
		rut=DigestUtils.md5Hex(pwd.trim())+"mcokzh6b4afloc51052vodfprxuemxhi";
		rut=DigestUtils.md5Hex(rut);/*二次加密*/
		return rut;
	}

	/**
	 * 上传图片或者视频
	 *
	 * */
	public static String upload(MultipartFile myfile, String NewName, String type) throws Exception {
		File file = new File ("/src/crossdomain.xml");
		Properties p = new Properties();
		InputStream is = null;
		is = Thread.currentThread().getContextClassLoader().getResourceAsStream("ftp.properties");
		p.load(is);
		String ADDRESS = p.getProperty("FTP_ADDRESS");
		String PORT = p.getProperty("FTP_PORT");
		String USERNAME = p.getProperty("FTP_USERNAME");
		String PASSWORD = p.getProperty("FTP_PASSWORD");

		String LOCATION="images";
		if("1".equals(type)){
			LOCATION = "images";
		}
		if("2".equals(type)){
			LOCATION = "video";
		}
		if (!myfile.isEmpty()) {
			int port = Integer.parseInt(PORT);
			FtpUtil.uploadFile(ADDRESS, port, USERNAME, PASSWORD, LOCATION, NewName, myfile.getInputStream());
		}
		return  p.getProperty("FTP_UEDITORIMAGE")+NewName;
	}





}
