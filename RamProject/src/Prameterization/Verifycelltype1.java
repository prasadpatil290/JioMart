package Prameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;
	
	public class Verifycelltype1 {

		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
			FileInputStream file = new FileInputStream("C:\\Users\\ramko\\eclipse-workspace\\RamProject\\bin\\Prameterization\\Book1.xlsx");
			
			//To verify type of cell means type of data present in cell
			Cell cellinfo = WorkbookFactory.create(file).getSheet("sheet1").getRow(3).getCell(2);
			
			CellType CT = cellinfo.getCellType();
			
			if(CT==CellType.BOOLEAN) {
				System.out.println(cellinfo.getBooleanCellValue());
			}
			else if(CT==CellType.STRING) {
				System.out.println(cellinfo.getStringCellValue());
			}
			else if(CT==CellType.NUMERIC) {
				System.out.println(cellinfo.getNumericCellValue());
				System.out.println("Data type is Numeric");
		}
	}
}