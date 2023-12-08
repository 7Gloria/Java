

import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWriteExcel 
{
	public static void main(String[] args) 
	{
		try
		{
		ReadWriteExcel obj = new ReadWriteExcel();
		String n= obj.ReadExcel("Sheet1",2,1);
		System.out.println(n + " is: ");
		String usn= obj.ReadExcel("Sheet1",3,1);
		System.out.println(usn + " is: ");
		
		obj.WriteExcel("SheetName", 2, 2, "Gloria");
		obj.WriteExcel("SheetName", 3, 2, "1CG21IS020");
		}
		catch(Exception e)
		{
			System.out.println("ReadExcel catch block");
			e.printStackTrace();
		}
		
	}

public String ReadExcel(String SheetName, int rNum, int cNum)
{
	String data = "";
	try
	{
		FileInputStream fis = new FileInputStream("D:\\Javabootcamp\\Demo.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(SheetName);
		Row r = s.getRow(rNum);
		Cell c = r.getCell(cNum);
		data = c.getStringCellValue();
	    
	}
	catch(Exception e)
	{
		System.out.println("ReadExcel catch block");
		e.printStackTrace();
	}
	return data;
	
}


public void WriteExcel(String SheetName, int rNum, int cNum, String DATA)
{
	
	try
	{
		FileInputStream fis = new FileInputStream("D:\\Javabootcamp\\Demo.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(SheetName);
		Row r = s.getRow(rNum);
		Cell c = r.createCell(cNum);
		c.setCellValue(DATA);
		FileOutputStream fos = new FileOutputStream("D:\\Javabootcamp\\Demo.xlsx");
	    wb.write(fos);  
	    wb.close();
	}
	catch(Exception e)
	{
		System.out.println("ReadExcel catch block");
		e.printStackTrace();
	}

}

}

