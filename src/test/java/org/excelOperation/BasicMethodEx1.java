package org.excelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BasicMethodEx1 {
	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("./Files./TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			int totalSheets = wb.getNumberOfSheets(); //workbook me kitni sheet h
			System.out.println("totalSheets :"+totalSheets);
			int index = wb.getSheetIndex("StringData"); // konse index pr h sheet
			System.out.println("index :"+index);
			String SheetName = wb.getSheetName(1);     //SheetName return krta h
			System.out.println(SheetName);
			System.out.println("*****All Sheet Name******");
			for(int i=0; i<totalSheets; i++) {
				System.out.println(wb.getSheetName(i));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
