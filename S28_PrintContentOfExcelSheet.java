package com.scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class S28_PrintContentOfExcelSheet
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException 
	{
		FileInputStream fis=new FileInputStream(".//ExcelFiles//Modified.xlsx");
		//HSSFWorkbook hb =new HSSFWorkbook();
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("sheet1");
		int rowCount = sheet.getLastRowNum();//returns index of the last row(row index starts from 0)
		
		for(int i=0;i<=rowCount;i++)
		{
			Row row = sheet.getRow(i);
			int cellCount = row.getLastCellNum();//returns index of the last cell(cell index starts from 1)
			//System.out.println(cell);
			for(int j=0; j<cellCount;j++)
			{
				Cell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.print(value+"-->");
			}
			System.out.println();//to print values in next line
		}

	}

}
