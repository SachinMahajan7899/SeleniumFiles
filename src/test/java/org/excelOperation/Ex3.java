	package org.excelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Ex3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Files./TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			//Sheet k liye
			Sheet s1 = wb.getSheet("StringData");
	
			for(int i=1;i<=s1.getLastRowNum();i++) {
				for(int j=0; j<s1.getRow(i).getLastCellNum(); j++) {
					System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
					
					
//			for(int i=1;i<=s1.getLastRowNum();i++) {
//				Row r = s1.getRow(i);
//				for(int j=0; j<r.getLastCellNum(); j++) {
//					Cell c = r.getCell(j);
//					System.out.println(c.getStringCellValue());
				}
				System.out.println();
			}
			
	}

}
