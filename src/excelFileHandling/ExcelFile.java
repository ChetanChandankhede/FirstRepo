package excelFileHandling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create a File class object and add excel sheet path along with file name and extension
		
		File myFile=new File("D:\\Software Testing\\Automation Testing\\Java & Selenium\\Practice Files\\group-7.xlsx");
		for(int i=0;i<=13;i++)
		{
			for(int j=0;j<=2;j++)
			{
				String value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(value1+"--");
				
			}
			System.out.println();
		}
		
		
		


	}

}
