package com.test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
 
	public static void main(String[] args) {
	File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\ExcelRead\\DataSheet\\Book1.xlsx");
		FileInputStream input = new FileInputStream(file);
	  Workbook book = new XSSFWorkbook(input);
        Sheet sheet = book.getSheet("Sheet1");
        Row row = book.getRow(3);
        Cell cell = row.getCell(1);
        System.out.println(cell);
        

	}

}
