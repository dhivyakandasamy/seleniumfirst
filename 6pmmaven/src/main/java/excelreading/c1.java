package excelreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class c1 {
	public static void main(String[] args) throws IOException {
		
	
	//apache poi, apache poi ooxml, apache poi ooxml schema
	
	//File : reach the path
	File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
	FileInputStream fis= new FileInputStream(f);
	// convert excel into a workbook
	XSSFWorkbook x= new XSSFWorkbook(fis);
	//reach the sheet
	XSSFSheet sheet = x.getSheetAt(0);
	// count total number of rows
	int row=sheet.getLastRowNum();
	System.out.println("Number of rows "+ row);
	// 0th row-=> number of columns
	int cell=sheet.getRow(0).getLastCellNum();
	System.out.println("Number of columns in row 0 : "+ cell);
	
	//row index, column index   2,1
	XSSFCell data = sheet.getRow(2).getCell(1);
	System.out.println(data);
	
	//ROW  : iterate column wise
	
	System.out.println("ROW 0");
	
	for(int i=0; i<cell;i++)
	{
		XSSFCell data1 = sheet.getRow(0).getCell(i);
		System.out.println(data1);
		
		// 0,0  0,1  0,2  0,3  0,4 
		
	}
	
	//column:  iterate row wise
	
System.out.println("COLUMN 0");
	
	for(int i=0; i<row;i++)
	{
		XSSFCell data1 = sheet.getRow(i).getCell(0);
		System.out.println(data1);
		
		// 0,0   1,0   2,0  3,0.... 69,0
		
	}

	//56,4 
	sheet.getRow(56).createCell(4).setCellValue("ABDUL");
	FileOutputStream fos= new FileOutputStream(f);
	x.write(fos);
}
}