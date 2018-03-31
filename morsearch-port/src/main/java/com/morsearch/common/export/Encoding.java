package com.morsearch.common.export;



public class Encoding {

	// Supported Encoding Types

	public static int GB2312 = 0;



	public static int GBK = 1;



	public static int HZ = 2;



	public static int BIG5 = 3;



	public static int CNS11643 = 4;



	public static int UTF8 = 5;



	public static int UNICODE = 6;



	public static int UNICODET = 7;



	public static int UNICODES = 8;



	public static int ISO2022CN = 9;



	public static int ISO2022CN_CNS = 10;



	public static int ISO2022CN_GB = 11;



	public static int ASCII = 12;



	public static int OTHER = 13;



	public static int TOTALTYPES = 14;



	// Names of the encodings as understood by Java

	public static String[] javaname;



	// Names of the encodings for human viewing

	public static String[] nicename;



	// Names of charsets as used in charset parameter of HTML Meta tag

	public static String[] htmlname;



	static {

		javaname = new String[TOTALTYPES];

		nicename = new String[TOTALTYPES];

		htmlname = new String[TOTALTYPES];



		// Assign encoding names

		javaname[GB2312] = "GB2312";

		javaname[HZ] = "ASCII"; // What to put here? Sun doesn't support HZ

		javaname[GBK] = "GBK";

		javaname[ISO2022CN_GB] = "ISO2022CN_GB";

		javaname[BIG5] = "BIG5";

		javaname[CNS11643] = "EUC-TW";

		javaname[ISO2022CN_CNS] = "ISO2022CN_CNS";

		javaname[ISO2022CN] = "ISO2022CN";

		javaname[UTF8] = "UTF8";

		javaname[UNICODE] = "Unicode";

		javaname[UNICODET] = "Unicode";

		javaname[UNICODES] = "Unicode";

		javaname[ASCII] = "ASCII";

		javaname[OTHER] = "ISO8859_1";



		// Assign encoding names

		htmlname[GB2312] = "GB2312";

		htmlname[HZ] = "HZ-GB-2312";

		htmlname[GBK] = "GB2312";

		htmlname[ISO2022CN_GB] = "ISO-2022-CN-EXT";

		htmlname[BIG5] = "BIG5";

		htmlname[CNS11643] = "EUC-TW";

		htmlname[ISO2022CN_CNS] = "ISO-2022-CN-EXT";

		htmlname[ISO2022CN] = "ISO-2022-CN";

		htmlname[UTF8] = "UTF-8";

		htmlname[UNICODE] = "UTF-16";

		htmlname[UNICODET] = "UTF-16";

		htmlname[UNICODES] = "UTF-16";

		htmlname[ASCII] = "ASCII";

		htmlname[OTHER] = "ISO8859-1";



		// Assign Human readable names

		nicename[GB2312] = "GB-2312";

		nicename[HZ] = "HZ";

		nicename[GBK] = "GBK";

		nicename[ISO2022CN_GB] = "ISO2022CN-GB";

		nicename[BIG5] = "Big5";

		nicename[CNS11643] = "CNS11643";

		nicename[ISO2022CN_CNS] = "ISO2022CN-CNS";

		nicename[ISO2022CN] = "ISO2022 CN";

		nicename[UTF8] = "UTF-8";

		nicename[UNICODE] = "Unicode";

		nicename[UNICODET] = "Unicode (Trad)";

		nicename[UNICODES] = "Unicode (Simp)";

		nicename[ASCII] = "ASCII";

		nicename[OTHER] = "OTHER";



	}



}