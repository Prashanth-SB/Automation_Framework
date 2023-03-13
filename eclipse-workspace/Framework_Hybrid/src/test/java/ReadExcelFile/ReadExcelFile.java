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

public class ReadExcelFile
{
@Test
	public void excelRead() throws IOException
{
	File src=new File(System.getProperty("user.dir")+"/TestData/data.xlsx");
	FileInputStream fis=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	int countofsheet=wb.getNumberOfSheets();
	System.out.println(countofsheet);
	XSSFSheet login=wb.getSheet("Login");
	System.out.println("Sheet Name is:"+login.getSheetName());
	
	XSSFRow row=login.getRow(1);
	XSSFCell cell=row.getCell(0);
	String data=cell.getStringCellValue();
	System.out.println(data);
	
	XSSFRow row1=login.getRow(1);
	XSSFCell cell1=row1.getCell(1);
	String data1=cell1.getStringCellValue();
	System.out.println(data1);
	
	XSSFSheet info=wb.getSheet("Info");
	System.out.println("Sheet Name is:"+ info.getSheetName());
	XSSFRow row2=info.getRow(1);
	XSSFCell cell2=row2.getCell(3);
	double number=cell2.getNumericCellValue();
	System.out.println(number);
	wb.close();
	
	
	
}
	
}
