package ReadExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

//import com.sun.org.apache.bcel.internal.classfile.Field;

public class ReadExcelFile2 {
	@Test
	public void excelRead() throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook(
				new FileInputStream(new File(System.getProperty("user.dir") + "/TestData/data.xlsx")));
		int countofsheet = wb.getNumberOfSheets();
		XSSFSheet sheetname = wb.getSheet("Login");
		System.out.println("Name of the sheet is:" + sheetname.getSheetName());

		String name = wb.getSheet("Login").getRow(2).getCell(1).getStringCellValue();
		System.out.println(name);

		boolean name1 = wb.getSheet("info").getRow(1).getCell(4).getBooleanCellValue();
		System.out.println(name1);
		wb.close();
		boolean name2 = wb.getSheet("info").getRow(2).getCell(4).getBooleanCellValue();
		System.out.println(name2);
		String name3 = wb.getSheet("info").getRow(2).getCell(4).getStringCellValue();
		System.out.println(name3);
		
		wb.close();

	}

}
