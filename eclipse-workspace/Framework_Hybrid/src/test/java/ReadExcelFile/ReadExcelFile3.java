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

public class ReadExcelFile3 {
	@Test
	public void excelRead() throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook(
				new FileInputStream(new File(System.getProperty("user.dir") + "/TestData/data.xlsx")));
		
		int row=wb.getSheet("Info").getPhysicalNumberOfRows();
		int col=wb.getSheet("Info").getRow(1).getPhysicalNumberOfCells();
		System.out.println("The number of row's:"+row);
		System.out.println("The number of colm's:"+col);
		
		for(int i=0;i<row;i++)
		{
			System.out.println(wb.getSheet("Info").getRow(i).getCell(1).getStringCellValue());
		}
		for(int i=0;i<row;i++)
		{
			System.out.println(wb.getSheet("Info").getRow(i).getCell(0).getStringCellValue());
		}
		
		wb.close();

	}

}
