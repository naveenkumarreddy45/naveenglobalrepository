package Mechanical;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Drivers/chromedriver.exe");
ChromeDriver c1=new ChromeDriver();
c1.get("http://laptop-kh427c1s/login.do");
c1.findElement(By.name("username")).sendKeys("admin");
c1.findElement(By.name("pwd")).sendKeys("manager");
c1.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
