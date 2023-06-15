package Prameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Printcell1 {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\ramko\\eclipse-workspace\\RamProject\\bin\\Prameterization\\Book1.xlsx");
		
		//To fetch Last cell number
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		
		int lastrowindex = sh.getLastRowNum();
		
		System.out.println(lastrowindex);
		
		for(int i=0; i<sh.getLastRowNum(); i++) {
			
			for(int j=0; j<= sh.getRow(i).getLastCellNum()-1; j++) {
			
				String data=sh.getRow(i).getCell(j).getStringCellValue();
		
				System.out.println(data+ " ");
			}
			System.out.println();
		}
	}
}
