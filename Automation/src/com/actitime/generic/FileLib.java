package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	/**
	 * 
	 * @param Key
	 * @return
	 * @throws IOException
	 */
public String getPropertyData(String Key) throws IOException {
	FileInputStream fis=new FileInputStream("/data/commondata.property.txt");
	Properties p=new Properties();
	p.load(fis);
	String data = p.getProperty(Key);
	return data;
}
/**
 * 
 * @param sheetName
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */

public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	 String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
/**
 * 
 * @param sheetName
 * @param row
 * @param cell
 * @param data
 * @throws IOException
 */
public void setExcelData(String sheetName,int row,int cell,String data) throws IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Properties p=new Properties();
	Workbook wb = WorkbookFactory.create(fis);
    wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data);
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
	wb.close();
	
	
}
}
