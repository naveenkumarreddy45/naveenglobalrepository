 package Datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceloperation {
	public static String readdata(String sheetName,int rownum,int cellnum)
	{
		try
		{
			FileInputStream fis=new FileInputStream("E:\\testdata\\userdata.xlsx");
			Workbook w1=WorkbookFactory.create(fis);
			String s=w1.getSheet(sheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
			return s;
		}
		catch(Exception rv)
		{
			return"invaliddata";
		}
	}
	public static void writedata(String sheetName,int rownum,int cellnum,String data)
	{
		try
		{
			FileInputStream fis=new FileInputStream("E:\\testdata\\userdata.xlsx");
			Workbook w1=WorkbookFactory.create(fis);
			w1.getSheet(sheetName).getRow(rownum).createCell(cellnum).setCellValue(data);
			FileOutputStream fos= new FileOutputStream("E:\\testdata\\userdata.xlsx");
			w1.write(fos);
		}
		catch(Exception rv)
		{
		
		}
	}

}
