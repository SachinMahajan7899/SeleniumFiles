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


public class Ex2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Files./TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			//Sheet k liye
			Sheet s1 = wb.getSheet("StringData");
			int lastRowNum = s1.getLastRowNum();
			System.out.println("lastRowNum: "+lastRowNum); // 1 row kam return krta h...mtlab indexing jesa
			int physicalNoOfRow = s1.getPhysicalNumberOfRows(); // jis row me data h wahi prit krta h
			System.out.println("physicalNoOfRow: "+physicalNoOfRow);
			//Row k liye
			Row r1 = s1.getRow(1); //Row no 0 ka data
			int getLastCellNum = r1.getLastCellNum();
			System.out.println("getLastCellNum: "+getLastCellNum);
			int getPhysicalNumberOfCells = r1.getPhysicalNumberOfCells();
			System.out.println("getPhysicalNumberOfCells: "+getPhysicalNumberOfCells);
			//Cell
			Cell c1 = r1.getCell(3);  // cell no 0 ka data
			System.out.println("CellStringValue :"+c1.getStringCellValue());
			
	}

}
