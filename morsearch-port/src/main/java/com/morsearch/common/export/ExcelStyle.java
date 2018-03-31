package com.morsearch.common.export;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelStyle {

	public static HSSFCellStyle getGeneralCellStyleLeft(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getGeneralCellStyleCenter(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getGeneralCellStyleRight(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getCellStyleBorderRight(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getCellStyleBorderLeft(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getCellStyleAlignCenterBorderRight(
			HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getCellStyleAlignRightBorderRight(
			HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getCellStyleBorderTopAndRight(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getCellStyleBorderbottom(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getCellStyleBorderRightAndBottom(
			HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getCellStyleBorderLeftAndBottom(
			HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getTableHeaderCellStyle(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getTableHeaderCellStyleLeft(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getTableHeaderCellStyleRight(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getTableLineCellStyleCenter(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getTableLineCellStyleRight(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getTableLineCellStyleLeft(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getTableBottomCellStyleRight(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getDeclarationCellStyle(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 24);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getDeclarationLineCellStyle(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 24);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getDeclarationBottomCellStyle(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_TOP);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 24);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getTitleCellStyle(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 25);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getTitleCellStyle1(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getCellStyle1lefttop(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 10);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getInvoiceExportCellStyle1(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_THICK);
		style.setBorderTop(HSSFCellStyle.BORDER_THICK);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 9);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getInvoiceExportCellStyle2(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_THICK);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 9);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getExpContractExportCellStyle1(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("Times New Roman");
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getExpContractExportCellStyle2(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("Times New Roman");
		font.setUnderline((byte) 20);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getExpContractExportCellStyle3(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("����");
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getExpContractExportCellStyle4(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("����");
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getExpContractExportCellStyle5(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("����");
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getExpContractExportCellStyle6(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 24);
		font.setBoldweight((short) 2000);
		font.setFontName("����");
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getExpContractExportCellStyle7(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 18);
		font.setBoldweight((short) 2000);
		font.setFontName("Times New Roman");
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getExpContractExportCellStyle8(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("����");
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getExpContractExportCellStyle9(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("����");
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getExpContractExportCellStyle10(
			HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("����");
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getExpContractExportCellStyle11(
			HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("Times New Roman");
		style.setFont(font);
		return style;
	}
	
	public static HSSFCellStyle getExpContractExportCellStyle112(
			HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("Times New Roman");
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getExpContractExportCellStyle12(
			HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("Times New Roman");
		style.setFont(font);
		return style;
	}

	//

	public static HSSFCellStyle getLineCellStyleLeft(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);

		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getLineCellStyleLeftRed(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);

		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 12);
		font.setColor(HSSFFont.COLOR_RED);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getLineCellStyleRight(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);

		style.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getLineCellStyleNumber(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);

		style.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFDataFormat format = book.createDataFormat();

		style.setDataFormat(format.getFormat("#,##0.00######"));

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getLineCellStyleNumberRed(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);

		style.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFDataFormat format = book.createDataFormat();

		style.setDataFormat(format.getFormat("#,##0.00######"));

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 12);
		font.setColor(HSSFFont.COLOR_RED);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getLineCellStyleNumber2(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);

		style.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFDataFormat format = book.createDataFormat();

		style.setDataFormat(format.getFormat("#,###.########"));

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getLineCellStyleNumber2Red(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);

		style.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFDataFormat format = book.createDataFormat();

		style.setDataFormat(format.getFormat("#,###.########"));

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 12);
		font.setColor(HSSFFont.COLOR_RED);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getLineCellStyleLong(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);

		style.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFDataFormat format = book.createDataFormat();

		style.setDataFormat(format.getFormat("#,###,###,###"));

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getLineCellStyleLongRed(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);

		style.setAlignment(HSSFCellStyle.ALIGN_RIGHT);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFDataFormat format = book.createDataFormat();

		style.setDataFormat(format.getFormat("#,###,###,###"));

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 12);
		font.setColor(HSSFFont.COLOR_RED);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getLineCellStyleDate(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);

		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFDataFormat format = book.createDataFormat();

		style.setDataFormat(format.getFormat("yyyy-mm-dd"));

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		style.setFont(font);
		return style;
	}

	public static HSSFCellStyle getLineCellStyleDateRed(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderTop(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderBottom(HSSFCellStyle.BORDER_DOTTED);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);

		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		style.setWrapText(true);

		HSSFDataFormat format = book.createDataFormat();

		style.setDataFormat(format.getFormat("yyyy-mm-dd"));

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 12);
		font.setColor(HSSFFont.COLOR_RED);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		style.setFont(font);
		return style;
	}
	
	public static HSSFCellStyle getExpContractExportCellStyle(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("����");
		style.setFont(font);
		return style;
	}
	
	public static HSSFCellStyle getExpContractExportCellStyleleftandright(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("����");
		style.setFont(font);
		return style;
	}
	
	public static HSSFCellStyle getExpContractExportCellStyleLB(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("����");
		style.setFont(font);
		return style;
	}
	
	public static HSSFCellStyle getExpContractExportCellStyleB(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("����");
		style.setFont(font);
		return style;
	}
	
	public static HSSFCellStyle getExpContractExportCellStyleLRB(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("����");
		style.setFont(font);
		return style;
	}
	
	public static HSSFCellStyle getExpContractExportCellStyleBom(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_LEFT);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("����");
		style.setFont(font);
		return style;
	}
	
	public static HSSFCellStyle getExpContractExportCellStylec(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("����");
		style.setFont(font);
		return style;
	}
	
	public static HSSFCellStyle getExpContractExportCellStyle1c(HSSFWorkbook book) {

		HSSFCellStyle style = book.createCellStyle();

		style.setBorderBottom(HSSFCellStyle.BORDER_NONE);
		style.setBorderLeft(HSSFCellStyle.BORDER_NONE);
		style.setBorderRight(HSSFCellStyle.BORDER_NONE);
		style.setBorderTop(HSSFCellStyle.BORDER_NONE);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setWrapText(true);

		HSSFFont font = book.createFont();

		font.setFontHeightInPoints((short) 8);
		font.setFontName("Times New Roman");
		style.setFont(font);
		return style;
	}

}
