package Hybridframework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceloperation {
	public static String readdata(String Sheetname,int rownum,int cellnum)
	{
		try
		{
			FileInputStream fis=new FileInputStream("E:\\testdata\\userdata.xlsx");
			Workbook w1=WorkbookFactory.create(fis);
			String s=w1.getSheet("Sheet1").getRow(4).getCell(2).getStringCellValue();
			return s;
		}
		catch(Exception rv)
		{
			return "invaliddata";
		}
	}
	public static void writedata(String Sheetname,int rownum,int cellnum,String data)
	{
		try 
		{
			FileInputStream fis=new FileInputStream("E:\\testdata\\userdata.xlsx");
			Workbook w1=WorkbookFactory.create(fis);
			w1.getSheet("Sheet1").createRow(4).createCell(2).setCellValue("selenium");
			FileOutputStream fos=new FileOutputStream("E:\\testdata\\userdata.xlsx");
			w1.write(fos);
		}
		catch(Exception rv)
		{
		
		}
	}
}
