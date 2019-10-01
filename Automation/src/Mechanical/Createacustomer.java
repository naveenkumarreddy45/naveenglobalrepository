package Mechanical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createacustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers/chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://laptop-kh427c1s/login.do");
		c1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		c1.findElement(By.xpath("//input[@type='submit']")).click();
		c1.findElement(By.linkText("Projects & Customers")).click();
		c1.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		c1.findElement(By.name("name")).sendKeys("bunny");
		c1.findElement(By.name("description")).sendKeys("he is a cute little boy");
		c1.findElement(By.xpath("//input[@value='Create Customer']")).click();
		String s=c1.findElement(By.className("successmsg")).getText();
		System.out.println(s);
		c1.findElement(By.linkText("bunny")).click();
		c1.findElement(By.xpath("//input[@value='Delete This Customer']")).click();
		c1.switchTo().alert().accept();
		String s1=c1.findElement(By.className("successmsg")).getText();
		System.out.println(s1);
	}

}
