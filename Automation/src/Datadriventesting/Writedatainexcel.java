package Datadriventesting;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException; 
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedatainexcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("E:\\testdata\\userdata.xlsx");
Workbook w1=WorkbookFactory.create(fis);
//w1.getSheet("Sheet1").createRow(1).createCell(9).setCellValue("manisha");//
Sheet s1=w1.getSheet("Sheet3");
Row r1=s1.createRow(2);
Cell c1=r1.createCell(1);
c1.setCellValue("manisha");
FileOutputStream fos=new FileOutputStream("E:\\testdata\\userdata.xlsx");
w1.write(fos);
System.out.println("execution successful");
	}

}
