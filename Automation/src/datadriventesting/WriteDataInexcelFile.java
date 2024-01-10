package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInexcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//get the java representive object of physical file
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	//create a workbook or open a excel sheet
	Workbook wb = WorkbookFactory.create(fis);
	//Enter the data by using setcellvalue method
    wb.getSheet("Student-table").getRow(1).getCell(2).setCellValue("fail");
    //to get the physical file of java representive object
    FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
    //actually write the data from here only
    wb.write(fos);
	}

}
