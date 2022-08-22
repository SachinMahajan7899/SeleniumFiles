package org.excelOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WriteDataCell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("*****Program Start****");
		FileInputStream fis = new FileInputStream("./Files./TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s1 = wb.getSheet("WriteData");
			for(int i=1; i<=s1.getLastRowNum(); i++) {
				s1.getRow(i).createCell(4).setCellValue("Pass");
			}
			FileOutputStream fos = new FileOutputStream("./Files./TestData.xlsx");
			wb.write(fos);
			fos.close(); 
			System.out.println("*****Program Ends****");
	}

}
