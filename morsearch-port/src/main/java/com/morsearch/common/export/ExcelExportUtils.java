package com.morsearch.common.export;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.Region;

import com.morsearch.common.export.ExcelCell;
import com.morsearch.common.export.ExcelStyle;
import com.morsearch.common.export.Encoding;
import com.morsearch.common.export.EncodingTranslate;


public class ExcelExportUtils {
	/**
	 * 获取系统根目录绝对路径
	 * 
	 * @param request
	 * @return String
	 */
	public static String getSystemResourceMapped(HttpServletRequest request) {
		return request.getSession().getServletContext().getRealPath("/");
	}

/*map值转换对应标题值*/
	public static List<Object[]> ExcelToResults(String[] excelheader, String[] excelkey, List<Map<String, Object>> excellist) {
		List<Object[]> results = new ArrayList<Object[]>();
		Object[] excelrow = null;
		int keycount = excelkey.length;
		int listcount=excellist.size();
		for (int i = 0; i <listcount ; i++) {
			Map<String, Object> mp=excellist.get(i);
			excelrow = new Object[excelheader.length];
			for(int j=0;j<keycount;j++){
				excelrow[j] =mp.get(excelkey[j]);
			};
			results.add(excelrow);
		}
		return results;
	}


	public static void exportExcel(String[] excelheader,
			OutputStream outputStream, List<?> excellist, boolean ishk) throws Exception {
		exportExcel(excelheader, outputStream, excellist, ishk,
				new HashSet<Object>(), new ArrayList<Object>());
	}


	public static void exportExcel(String templetPath, int startRow,
			OutputStream outputStream, List<?> excellist, boolean ishk) throws Exception {
		exportExcel(templetPath, startRow, outputStream, excellist, ishk,
				new HashSet<Object>(), new ArrayList<Object>());
	}

	public static void exportExcel(String templetPath, int startRow,
			int startCol, OutputStream outputStream, List<?> excellist,
			boolean ishk) throws Exception {
		exportExcel(templetPath, startRow, startCol, outputStream, excellist,
				ishk,
				new HashSet<Object>(), new ArrayList<Object>());
	}

	// javax.swing.plaf.synth
	@SuppressWarnings("deprecation")
	public static void exportExcel(String[] excelheader,
			OutputStream outputStream, List<?> excellist, boolean ishk,
			Set<?> redcells, List<?> mergedcells) throws Exception {

		HSSFWorkbook book;

		HSSFSheet sheet;

		HSSFRow row;

		HSSFCell cell;

		try {

			book = new HSSFWorkbook();
			sheet = book.createSheet();
			book.setSheetName(0, "sheet1");
			sheet.setDefaultRowHeightInPoints(20); /*设置宽度大小*/

			for (int i = 0; i < excelheader.length; i++) {
				sheet.setColumnWidth((short) i, (short) 3840);
			}

			HSSFCellStyle styleLeft = ExcelStyle.getLineCellStyleLeft(book);

			HSSFCellStyle styleLeftRed = ExcelStyle.getLineCellStyleLeft(book);

			HSSFCellStyle styleLong = ExcelStyle.getLineCellStyleLong(book);

			HSSFCellStyle styleLongRed = ExcelStyle
					.getLineCellStyleLongRed(book);

			HSSFCellStyle styleNumber = ExcelStyle.getLineCellStyleNumber(book);

			HSSFCellStyle styleNumberRed = ExcelStyle
					.getLineCellStyleNumberRed(book);

			HSSFCellStyle styleDate = ExcelStyle.getLineCellStyleDate(book);

			HSSFCellStyle styleDateRed = ExcelStyle.getLineCellStyleDate(book);

			row = sheet.createRow(0);

			if (excelheader != null) {
				for (int i = 0; i < excelheader.length; i++) {

					cell = row.createCell((short) i);
					cell.setCellStyle(styleLeft);
					//cell.setEncoding(HSSFCell.ENCODING_UTF_16);

					if (ishk) {
						cell
								.setCellValue(EncodingTranslate.convertString(
										excelheader[i], Encoding.GB2312,
										Encoding.BIG5));
					} else {
						cell.setCellValue(excelheader[i]);
					}

				}
			}

			for (int i = 0; i < excellist.size(); i++) {

				Object[] excelrow = (Object[]) excellist.get(i);

				row = sheet.createRow(i + 1);

				for (int j = 0; j < excelrow.length; j++) {
					cell = row.createCell((short) j);
					if (excelrow[j] instanceof Long) {

						if (redcells.contains(new ExcelCell(i, j)))
							cell.setCellStyle(styleLongRed);
						else
							cell.setCellStyle(styleLong);

						cell.setCellValue(((Long) excelrow[j]).doubleValue());

					} else if (excelrow[j] instanceof BigDecimal) {

						if (((BigDecimal) excelrow[j]).scale() == 0) {
							if (redcells.contains(new ExcelCell(i, j)))
								cell.setCellStyle(styleLongRed);
							else
								cell.setCellStyle(styleLong);
						} else {
							if (redcells.contains(new ExcelCell(i, j)))
								cell.setCellStyle(styleNumberRed);
							else
								cell.setCellStyle(styleNumber);
						}

						cell.setCellValue(((Number) excelrow[j]).doubleValue());

					} else if (excelrow[j] instanceof Number) {

						if (redcells.contains(new ExcelCell(i, j)))
							cell.setCellStyle(styleNumberRed);
						else
							cell.setCellStyle(styleNumber);

						cell.setCellValue(((Number) excelrow[j]).doubleValue());

					} else if (excelrow[j] instanceof Date) {
						if (redcells.contains(new ExcelCell(i, j)))
							cell.setCellStyle(styleDateRed);
						else
							cell.setCellStyle(styleDate);

						cell.setCellValue((Date) excelrow[j]);

					} else {
						if (redcells.contains(new ExcelCell(i, j)))
							cell.setCellStyle(styleLeftRed);
						else
							cell.setCellStyle(styleLeft);

						//cell.setEncoding(HSSFCell.ENCODING_UTF_16);

						if (ishk) {
							cell.setCellValue(EncodingTranslate.convertString(
									ExcelExportUtils.formatString(excelrow[j]),
									Encoding.GB2312, Encoding.BIG5));
						} else {
							cell.setCellValue(ExcelExportUtils
									.formatString(excelrow[j]));
						}

					}

				}

			}

			for (int i = 0; i < mergedcells.size(); i++) {
				sheet.addMergedRegion((Region) mergedcells.get(i));
			}

			book.write(outputStream);

			outputStream.close();

		} catch (Exception ex) {

			ex.printStackTrace();

			throw new Exception("error.excel.download");

		}
	}

	// javax.swing.plaf.synth
	@SuppressWarnings("deprecation")
	public static void exportExcel(String path, int startRow,
			OutputStream outputStream,
			List<?> excellist, boolean ishk, Set<?> redcells,
			List<?> mergedcells) throws Exception {

		HSSFWorkbook book;

		HSSFSheet sheet;

		HSSFRow row;

		HSSFCell cell;

		try {
			InputStream is = new FileInputStream(path);

			book = new HSSFWorkbook(is);
			sheet = book.getSheet("Sheet1");

			sheet.setDefaultRowHeightInPoints(10);

			HSSFCellStyle styleLeft = ExcelStyle.getLineCellStyleLeft(book);

			HSSFCellStyle styleLeftRed = ExcelStyle.getLineCellStyleLeft(book);

			HSSFCellStyle styleLong = ExcelStyle.getLineCellStyleLong(book);

			HSSFCellStyle styleLongRed = ExcelStyle
					.getLineCellStyleLongRed(book);

			HSSFCellStyle styleNumber = ExcelStyle.getLineCellStyleNumber(book);

			HSSFCellStyle styleNumberRed = ExcelStyle
					.getLineCellStyleNumberRed(book);

			HSSFCellStyle styleDate = ExcelStyle.getLineCellStyleDate(book);

			HSSFCellStyle styleDateRed = ExcelStyle.getLineCellStyleDate(book);

			row = sheet.createRow(startRow);
			int len = startRow;
			for (int i = 0; i < excellist.size(); i++) {

				Object[] excelrow = (Object[]) excellist.get(i);

				row = sheet.createRow(len);

				for (int j = 0; j < excelrow.length; j++) {
					cell = row.createCell((short) j);
					if (excelrow[j] instanceof Long) {

						if (redcells.contains(new ExcelCell(i, j)))
							cell.setCellStyle(styleLongRed);
						else
							cell.setCellStyle(styleLong);

						cell.setCellValue(((Long) excelrow[j]).doubleValue());

					} else if (excelrow[j] instanceof BigDecimal) {

						if (((BigDecimal) excelrow[j]).scale() == 0) {
							if (redcells.contains(new ExcelCell(i, j)))
								cell.setCellStyle(styleLongRed);
							else
								cell.setCellStyle(styleLong);
						} else {
							if (redcells.contains(new ExcelCell(i, j)))
								cell.setCellStyle(styleNumberRed);
							else
								cell.setCellStyle(styleNumber);
						}

						cell.setCellValue(((Number) excelrow[j]).doubleValue());

					} else if (excelrow[j] instanceof Number) {

						if (redcells.contains(new ExcelCell(i, j)))
							cell.setCellStyle(styleNumberRed);
						else
							cell.setCellStyle(styleNumber);

						cell.setCellValue(((Number) excelrow[j]).doubleValue());

					} else if (excelrow[j] instanceof Date) {
						if (redcells.contains(new ExcelCell(i, j)))
							cell.setCellStyle(styleDateRed);
						else
							cell.setCellStyle(styleDate);

						cell.setCellValue((Date) excelrow[j]);

					} else {
						if (redcells.contains(new ExcelCell(i, j)))
							cell.setCellStyle(styleLeftRed);
						else
							cell.setCellStyle(styleLeft);

						//cell.setEncoding(HSSFCell.ENCODING_UTF_16);

						if (ishk) {
							cell.setCellValue(EncodingTranslate.convertString(
									ExcelExportUtils.formatString(excelrow[j]),
									Encoding.GB2312, Encoding.BIG5));
						} else {
							cell.setCellValue(ExcelExportUtils
									.formatString(excelrow[j]));
						}

					}

				}
				len++;

			}

			for (int i = 0; i < mergedcells.size(); i++) {
				sheet.addMergedRegion((Region) mergedcells.get(i));
			}

			book.write(outputStream);

			is.close();
			outputStream.close();

		} catch (Exception ex) {

			ex.printStackTrace();

			throw new Exception("error.excel.download");

		}
	}

	// javax.swing.plaf.synth
	@SuppressWarnings("deprecation")
	public static void exportExcel(String path, int startRow, int startCol,
			OutputStream outputStream, List<?> excellist, boolean ishk,
			Set<?> redcells, List<?> mergedcells) throws Exception {

		HSSFWorkbook book;

		HSSFSheet sheet;

		HSSFRow row;

		HSSFCell cell;

		try {
			InputStream is = new FileInputStream(path);

			book = new HSSFWorkbook(is);
			sheet = book.getSheet("Sheet1");

			sheet.setDefaultRowHeightInPoints(10);

			HSSFCellStyle styleLeft = ExcelStyle.getLineCellStyleLeft(book);

			HSSFCellStyle styleLeftRed = ExcelStyle.getLineCellStyleLeft(book);

			HSSFCellStyle styleLong = ExcelStyle.getLineCellStyleLong(book);

			HSSFCellStyle styleLongRed = ExcelStyle
					.getLineCellStyleLongRed(book);

			HSSFCellStyle styleNumber = ExcelStyle.getLineCellStyleNumber(book);

			HSSFCellStyle styleNumberRed = ExcelStyle
					.getLineCellStyleNumberRed(book);

			HSSFCellStyle styleDate = ExcelStyle.getLineCellStyleDate(book);

			HSSFCellStyle styleDateRed = ExcelStyle.getLineCellStyleDate(book);

			row = sheet.createRow(startRow);
			int len = startRow;
			for (int i = 0; i < excellist.size(); i++) {

				Object[] excelrow = (Object[]) excellist.get(i);

				row = sheet.createRow(len);

				for (int j = 0; j < excelrow.length; j++) {
					cell = row.createCell((short) startCol);
					if (excelrow[j] instanceof Long) {

						if (redcells.contains(new ExcelCell(i, j)))
							cell.setCellStyle(styleLongRed);
						else
							cell.setCellStyle(styleLong);

						cell.setCellValue(((Long) excelrow[j]).doubleValue());

					} else if (excelrow[j] instanceof BigDecimal) {

						if (((BigDecimal) excelrow[j]).scale() == 0) {
							if (redcells.contains(new ExcelCell(i, j)))
								cell.setCellStyle(styleLongRed);
							else
								cell.setCellStyle(styleLong);
						} else {
							if (redcells.contains(new ExcelCell(i, j)))
								cell.setCellStyle(styleNumberRed);
							else
								cell.setCellStyle(styleNumber);
						}

						cell.setCellValue(((Number) excelrow[j]).doubleValue());

					} else if (excelrow[j] instanceof Number) {

						if (redcells.contains(new ExcelCell(i, j)))
							cell.setCellStyle(styleNumberRed);
						else
							cell.setCellStyle(styleNumber);

						cell.setCellValue(((Number) excelrow[j]).doubleValue());

					} else if (excelrow[j] instanceof Date) {
						if (redcells.contains(new ExcelCell(i, j)))
							cell.setCellStyle(styleDateRed);
						else
							cell.setCellStyle(styleDate);

						cell.setCellValue((Date) excelrow[j]);

					} else {
						if (redcells.contains(new ExcelCell(i, j)))
							cell.setCellStyle(styleLeftRed);
						else
							cell.setCellStyle(styleLeft);

						//cell.setEncoding(HSSFCell.ENCODING_UTF_16);

						if (ishk) {
							cell.setCellValue(EncodingTranslate.convertString(
									ExcelExportUtils.formatString(excelrow[j]),
									Encoding.GB2312, Encoding.BIG5));
						} else {
							cell.setCellValue(ExcelExportUtils
									.formatString(excelrow[j]));
						}

					}

				}
				len++;

			}

			for (int i = 0; i < mergedcells.size(); i++) {
				sheet.addMergedRegion((Region) mergedcells.get(i));
			}

			book.write(outputStream);

			is.close();
			outputStream.close();

		} catch (Exception ex) {

			ex.printStackTrace();

			throw new Exception("error.excel.download");

		}
	}

	/**
	 * 传参文件名构造
	 * 
	 * @param fileName
	 * @return
	 */
	private static String getFileName(String fileName) {
		StringBuffer str = new StringBuffer(fileName);
		str.append("xls");
		return str.toString();
	}

	public static final String EMPTY = "";

	public static String formatString(Object val) {
		if (val == null)
			return EMPTY;

		if (val instanceof Date)
			return formatDate((Date) val);

		return StringUtils.stripToEmpty(val.toString());

	}

	public static String formatDate(Date val) {

		if (val == null)
			return "";

		return DateFormatUtils.ISO_DATE_FORMAT.format(val);

	}
}
