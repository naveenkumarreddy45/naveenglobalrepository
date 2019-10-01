package Datadriventesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createcustomer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    String url=Exceloperation.readdata("sheet3",1,0);
		String un=Exceloperation.readdata("sheet3",1,1);
		String psd=Exceloperation.readdata("sheet3",1,2);
		String custname=Exceloperation.readdata("sheet3",1,3);
		String exp=Exceloperation.readdata("sheet3",1,4);
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers/chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get(url);
		c1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		c1.findElement(By.name("username")).sendKeys(un);
		c1.findElement(By.name("pwd")).sendKeys(psd);
		c1.findElement(By.xpath("//input[@type='submit']")).click();
		c1.findElement(By.linkText("Projects & Customers")).click();
		c1.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		c1.findElement(By.name("name")).sendKeys(custname);
		c1.findElement(By.name("createCustomerSubmit")).click();
		Thread.sleep(3000);
		String actual=c1.findElement(By.className("successmsg")).getText();
		Exceloperation.writedata("Sheet3",1,5,actual);
		if(exp.equals(actual))
		{
			Exceloperation.writedata("Sheet3",1,6,"pass");
		}
		else
		{
			Exceloperation.writedata("Sheet3",1,6,"fail");
		}
	}

}
