package excelreadandwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class c2 {

	@Test
	public void rw() throws IOException
	{
		
		// apache poi, apache poi ooxml, apache poi ooxml schema
		
		File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
		
		FileInputStream fis= new FileInputStream(f);
		// convert xcel file into a work
		
		// xlsx: XSSFWorkbook
		//xls  : HSSFWorkbook
		
		XSSFWorkbook x= new XSSFWorkbook(fis);
		// reach the sheet
		XSSFSheet sheet = x.getSheetAt(0);
		
		// number of rows
		
		int row=sheet.getLastRowNum();
		System.out.println("Number of rows : "+ row);
		
		//Row 0 => number of columns
		int cell=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns in first row " + cell);
		
		// row index, col index=> 5,2
		
		XSSFCell data = sheet.getRow(5).getCell(2);
		System.out.println(data);
		
		
		//writing : know the row index, col index 
		sheet.getRow(3).createCell(5).setCellValue("Arun");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);
		
	}
}
