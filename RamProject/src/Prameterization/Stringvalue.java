package Prameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//Parameterization --so we will see how to get data from excel file to our program

public class Stringvalue {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\ramko\\eclipse-workspace\\RamProject\\bin\\Prameterization\\Book1.xlsx");
		
		//To fetch String 
		
//		String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(data);
		
		String data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(6).getStringCellValue();
		System.out.println(data);
		
	}
}
