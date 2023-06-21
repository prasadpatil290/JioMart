package Utils;

import java.io.IOException;
import java.io.FileInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import amazon.Login4DataDriven;

public class Utility {

	public static String getTD(int RowIndex, int CellIndex) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\ramko\\git\\JioMart\\amazonpr\\src\\main\\java\\Utils\\Data.xlsx");

		org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		return value;
	}

}
