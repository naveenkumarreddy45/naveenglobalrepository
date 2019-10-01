package Mechanical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Addtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers/chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://laptop-kh427c1s/login.do");
		c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		c1.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement d1=c1.findElement(By.name("customerProject.shownCustomer"));
		Select s1=new Select(d1);
		s1.selectByIndex(2);
		WebElement d=c1.findElement(By.name("customerProject.shownProject"));
		Select s2=new Select(d);
		s2.selectByIndex(2);
		c1.findElement(By.xpath("//input[@value='Add New Tasks']")).click();
		c1.findElement(By.name("task[0].name")).sendKeys("designing");
		c1.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		c1.findElement(By.linkText("designing")).click();
		c1.findElement(By.xpath("//input[@value='Delete This Task']")).click(); 
		c1.switchTo().alert().accept();
		String s3=c1.findElement(By.className("successmsg")).getText();
		System.out.println(s3);
	}

}
