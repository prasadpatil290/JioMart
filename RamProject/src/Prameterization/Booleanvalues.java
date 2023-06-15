package Prameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Booleanvalues {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\ramko\\eclipse-workspace\\RamProject\\bin\\Prameterization\\Book1.xlsx");
		
		//To fetch Boolean  like True or false
		
		boolean data1 = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(5).getBooleanCellValue();
		System.out.println(data1);
		
	}
}
