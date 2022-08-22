package org.excelOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WriteDataCellEx2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Files./TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s1 = wb.getSheet("WriteData");
			Row r1 = s1.getRow(1);
			Cell c1 = r1.createCell(4);
			c1.setCellValue("Pass");
			FileOutputStream fos = new FileOutputStream("./Files./TestData.xlsx");
			wb.write(fos);
			fos.close(); 
	}

}
