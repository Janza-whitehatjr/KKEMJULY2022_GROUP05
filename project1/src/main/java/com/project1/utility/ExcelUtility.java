package com.project1.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	private static XSSFWorkbook excelWBook;
	 private static XSSFSheet excelWsheet;
	 
	 public static String getCellValue(String SheetName, int RowNum1,int ColNum1) throws IOException
	 {
		 //FileInputStream ExcelFile1 = new FileInputStream("/Users/arjun/Software Testing/Project1/src/main/resources/LoginData.csv");
		 FileInputStream ExcelFile1 = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"  + "/LoginData.csv");
		 excelWBook=new XSSFWorkbook(ExcelFile1);
		 excelWsheet = excelWBook.getSheet(SheetName);
		 return excelWsheet.getRow(RowNum1).getCell(ColNum1).getStringCellValue();
	 }
}

