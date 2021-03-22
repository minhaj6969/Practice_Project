package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelConnection {
	
	public static void main(String[] args) throws Throwable {
		
		//first need to take dependencies apache poi on pom.xml 
		
		FileInputStream fis = new FileInputStream("need to get excel path");
		
		Workbook wb = WorkbookFactory.create(fis);
		// you have to take dependencies on pom.xml first then import WORKBOOK
		
		Sheet sh = wb.getSheet("pass your own excel sheet name");
		
		String str = sh.getRow(3).getCell(3).getStringcellvalue();//depends on which row and depends on which cell value to get inside the value
		
		System.out.println(str);
				
	
		
	}

}
