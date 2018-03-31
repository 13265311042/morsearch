package com.morsearch.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeUtil {


	public static Date getDateFormat(String dv, String format) throws ParseException {
		if (format==null){format="yyyy-MM-dd";};
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date d = sdf.parse(dv);
		return d;
	}

	public static String getStrFormat(Date dv, String format) {
		if (format==null){format="yyyy-MM-dd";};
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(dv);
	}

	public static Date getstrToDate(String dv) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return sdf.parse(dv);
		} catch (ParseException e) {
			e.printStackTrace();
			return  null;
		}
	}

	/**
	 *
	 * @return
	 */
	public static String getDateTostr(Date dv) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (dv==null){dv=new Date();};
		return dateFormat.format(dv);
	}

	/**
	 * 日期转中文显示
	 *
	 * @return
	 */
	public static String getDateStrChinese(Date dv) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
		if (dv==null){dv=new Date();};
		return dateFormat.format(dv);
	}


	/**
	 * 日期转字符串 HH:mm:ss
	 * 
	 * @param date
	 * @return
	 */
	public static String getTimeStr(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		return dateFormat.format(date);
	}

	/**
	 * 在date基础上增加addDays天
	 * 
	 * @param date
	 * @param addDays
	 * @return
	 */
	public static Date addDay(Date date, int addDays) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, addDays);
		return calendar.getTime();
	}

	/**
	 * 在date基础上增加addMonths个月
	 * 
	 * @param date
	 * @param addMonths
	 * @return
	 */
	public static Date addMonth(Date date, int addMonths) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, addMonths);
		return calendar.getTime();
	}

	/**
	 * 在date基础上增加addHours小时
	 * 
	 * @param date
	 * @param addHours
	 * @return
	 */
	public static Date addHour(Date date, int addHours) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR, addHours);
		return calendar.getTime();
	}

	/**
	 * 在date基础上增加addMinute分钟
	 *
	 * @param date
	 * @param addMinute
	 * @return
	 */
	public static Date addMinute(Date date, int addMinute) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MINUTE, addMinute);
		return calendar.getTime();
	}


	/**
	 * 在date基础上增加addMonths月addDays天
	 * 
	 * @param date
	 * @param addMonths
	 * @param addDays
	 * @return
	 */
	public static Date addTime(Date date, int addMonths, int addDays) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, addMonths);
		calendar.add(Calendar.DATE, addDays);
		return calendar.getTime();
	}

	/**
	 * 在date基础上增加addYears年addMonths月addDays天
	 * 
	 * @param date
	 * @param addYears
	 * @param addMonths
	 * @param addDays
	 * @return
	 */
	public static Date addTime(Date date, int addYears, int addMonths, int addDays) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, addYears);
		calendar.add(Calendar.MONTH, addMonths);
		calendar.add(Calendar.DATE, addDays);
		return calendar.getTime();
	}

	/**
	 * 在date基础上增加addYears年addMonths月addDays天addHours小时
	 * 
	 * @param date
	 * @param addYears
	 * @param addMonths
	 * @param addDays
	 * @param addHours
	 * @return
	 */
	public static Date addTime(Date date, int addYears, int addMonths, int addDays, int addHours) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.YEAR, addYears);
		calendar.add(Calendar.MONTH, addMonths);
		calendar.add(Calendar.DATE, addDays);
		calendar.add(Calendar.HOUR, addHours);
		return calendar.getTime();
	}

	/**
	 * 计算两个日期之间相差的天数
	 * 
	 * @param smdate
	 *            较小的时间
	 * @param bdate
	 *            较大的时间
	 * @return 相差天数
	 * @throws ParseException
	 */
	public static int getDaysBetween(Date smdate, Date bdate) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		smdate = dateFormat.parse(dateFormat.format(smdate));
		bdate = dateFormat.parse(dateFormat.format(bdate));
		Calendar cal = Calendar.getInstance();
		cal.setTime(smdate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(bdate);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);
		return Integer.parseInt(String.valueOf(between_days));
	}

	/**
	 * 获取 两个日期相差的月数
	 * 
	 * @param date1
	 * @param date2
	 * @param roundUP
	 *            true:不够一个月按一个月算，false:不够一个月忽略
	 * @return
	 */
	public static int getMonthsBetween(Date date1, Date date2, Boolean roundUP) {
		int result = 0;
		Date dateBefore = date1.before(date2) ? date1 : date2;
		Date dateAfter = date2.after(date1) ? date2 : date1;
		Date tempDate = dateBefore;
		do {
			tempDate = addMonth(tempDate, 1);
			if (roundUP != null && roundUP) {
				result++;
			} else {
				if (tempDate.before(dateAfter) || tempDate.compareTo(dateAfter) == 0) {
					result++;
				}
			}
		} while (tempDate.before(dateAfter));
		return result;
	}

	/**
	 * 获取 两个日期相差的月数
	 * 
	 * @param date1
	 * @param date2
	 * @param roundUP
	 *            true:不够一个月按一个月算，false:不够一个月忽略
	 * @return
	 * @throws ParseException
	 */
	public static int getMonthsBetween(String date1, String date2, Boolean roundUP) throws ParseException {
		int result = 0;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date3 = dateFormat.parse(date1);
		Date date4 = dateFormat.parse(date2);
		Date dateBefore = date3.before(date4) ? date3 : date4;
		Date dateAfter = date4.after(date3) ? date4 : date3;
		Date tempDate = dateBefore;
		do {
			tempDate = addMonth(tempDate, 1);
			if (roundUP != null && roundUP) {
				result++;
			} else {
				if (tempDate.before(dateAfter)) {
					result++;
				}
			}
		} while (tempDate.before(dateAfter));
		return result;
	}

	/*
	 * 将毫秒 换算成(天 时 分 秒 )
	 */
	public static String formatTime(Long ms) {
		Integer ss = 1000;
		Integer mi = ss * 60;
		Integer hh = mi * 60;
		Integer dd = hh * 24;
		Long day = ms / dd;
		Long hour = (ms - day * dd) / hh;
		Long minute = (ms - day * dd - hour * hh) / mi;
		Long second = (ms - day * dd - hour * hh - minute * mi) / ss;
		// Long milliSecond = ms - day * dd - hour * hh - minute * mi - second *
		// ss;
		StringBuffer sb = new StringBuffer();
		if (day > 0) {
			sb.append(day + "天");
		}
		if (hour > 0) {
			sb.append(hour + "小时");
		}
		if (minute > 0) {
			sb.append(minute + "分");
		}
		if (second > 0) {
			sb.append(second + "秒");
		}
		/*
		 * if(milliSecond > 0) { sb.append(milliSecond+"毫秒"); }
		 */
		return sb.toString();
	}

	/**
	 * 获取当前月份第一天
	 * 
	 * @return
	 */
	public static Date getCurrentMothFirstDay() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 1);// 设置为1号,当前日期既为本月第一天
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		return calendar.getTime();
	}

	/**
	 * 获取当前月份最后一天
	 * 
	 * @return
	 */
	public static Date getCurrentMothLastDay() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		return calendar.getTime();
	}

	/**
	 * 获取上一月份第一天
	 * 
	 * @return
	 */
	public static Date getPrevMothFirstDay() {
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);// 设置为1号,当前日期既为本月第一天
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		return calendar.getTime();
	}

	/**
	 * 获取上一月份最后一天
	 * 
	 * @return
	 */
	public static Date getPrevMothLastDay() {
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		return calendar.getTime();
	}

	/**
	 * 判断时间点是否在时间段内
	 * 
	 * @param date
	 * @param strDateBegin
	 * @param strDateEnd
	 * @return
	 */
	public static boolean isInDate(Date date, Date strDateBegin, Date strDateEnd) {
		Calendar date1 = Calendar.getInstance();
		date1.setTime(date);
		Calendar start = Calendar.getInstance();
		start.setTime(strDateBegin);
		Calendar end = Calendar.getInstance();
		end.setTime(strDateEnd);
		if (date1.after(start) && date1.before(end)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 获取日期一天中的小时
	 * 
	 * @param date
	 * @return
	 */
	public static int getDateHour(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		return hour;
	}

	/**
	 * 比较日期大小，第一个参数大则返回true
	 * 
	 * @param date
	 * @param date1
	 * @return
	 */
	public static boolean compareDate(Date date, Date date1) {
		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		calendar.setTime(date);
		calendar2.setTime(date1);
		if (calendar.compareTo(calendar2) >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public static Date todayMinTime(){
		long current=System.currentTimeMillis();//当前时间毫秒数
		long zero=current/(1000*3600*24)*(1000*3600*24)- TimeZone.getDefault().getRawOffset();//今天零点零分零秒的毫秒数
		return new Date(zero);

	}
	public static Date todayMaxTime(){
		long current=System.currentTimeMillis();//当前时间毫秒数
		long zero=current/(1000*3600*24)*(1000*3600*24)-TimeZone.getDefault().getRawOffset();//今天零点零分零秒的毫秒数
		long twelve=zero+24*60*60*1000-1;//今天23点59分59秒的毫秒数
		return new Date(twelve);
	}


	public static long dateconvertlong(Date dt){/*日期转long值*/
		long lSysTime1 =0L;
		if (dt!=null){lSysTime1=dt.getTime() / 1000;};   //得到秒数，Date类型的getTime()返回毫秒数
		return lSysTime1;
	}

	public static Date longconvertdate(Long lg){/*日期转long值*/
		if (String.valueOf(lg).length()==10){lg=lg*1000;};/*10位长度时，需要增长13位*/
		Calendar ca = Calendar.getInstance();
		ca.setTimeInMillis(lg);
		return ca.getTime();
	}






}
