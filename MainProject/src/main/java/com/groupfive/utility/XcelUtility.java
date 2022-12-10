package com.groupfive.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XcelUtility {
	private static XSSFWorkbook excelWBook;
	 private static XSSFSheet excelWsheet;
	 
	 
	 public static String getCellData(int RowNum,int ColNum) throws IOException
	 {
		 FileInputStream ExcelFile = new FileInputStream("/Users/arjun/MainProject/src/main/resources/TestData.xlsx");
		 excelWBook=new XSSFWorkbook(ExcelFile);
		 excelWsheet = excelWBook.getSheetAt(0);
		 return excelWsheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
	 }
}
