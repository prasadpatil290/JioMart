package Prameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lastvalues {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\ramko\\eclipse-workspace\\RamProject\\bin\\Prameterization\\Book1.xlsx");
		
		//To fetch Last cell number
		int data = WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum();
		System.out.println(data +1);
		
//		int data1 = WorkbookFactory.create(file).getSheet("sheet1").getRow(3).getLastCellNum();
//		System.out.println(data1);
//		
//		int data = WorkbookFactory.create(file).getSheet("sheet1").getRow(3).getFirstCellNum();
//		System.out.println(data);
		
//		String data2 = WorkbookFactory.create(file).getSheet("sheet1").getSheetName();
//		System.out.println(data2);
		
	}
}
