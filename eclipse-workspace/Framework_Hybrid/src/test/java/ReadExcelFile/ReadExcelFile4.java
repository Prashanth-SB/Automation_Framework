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

public class ReadExcelFile4 {
	@Test
	public void excelRead() throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook(
				new FileInputStream(new File(System.getProperty("user.dir") + "/TestData/data.xlsx")));
		
		int row=wb.getSheet("Login").getPhysicalNumberOfRows();
		int col=wb.getSheet("Login").getRow(1).getPhysicalNumberOfCells();
		System.out.println("The number of row's:"+row);
		System.out.println("The number of colm's:"+col);
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			System.out.println(wb.getSheet("Login").getRow(i).getCell(j).getStringCellValue());
		}
		
		}
		wb.close();

	}

}
