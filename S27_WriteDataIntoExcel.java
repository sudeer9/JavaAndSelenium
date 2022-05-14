package com.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class S27_WriteDataIntoExcel
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException 
	{
		FileInputStream fis=new FileInputStream(".//ExcelFiles//test.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("sheet1");
		//Existing row, existing cell
		sheet.getRow(0).createCell(1).setCellValue("Bangalore");
		sheet.getRow(0).getCell(1).setCellValue("Bangalore");
		//existing row, new cell
		//sheet.getRow(0).createCell(1).setCellValue("Bangalore");
		//new row and new cell
		sheet.createRow(1).createCell(0).setCellValue("7 am batch");
		//Writing data into excel 
		FileOutputStream fos=new FileOutputStream(".//ExcelFiles//Modified.xlsx");
		//In the above line, change the name of the file if you want to "Save As"
		//It will create new file
		wb.write(fos);
		
		

	}

}
