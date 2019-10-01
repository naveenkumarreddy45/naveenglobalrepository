package Mechanical;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adduser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers/chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://laptop-kh427c1s/login.do");
		c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		c1.findElement(By.xpath("//input[@type='submit']")).click();
		c1.findElement(By.linkText("Users")).click();
		c1.findElement(By.xpath("//input[@value='Add New User']")).click();
		c1.findElement(By.name("username")).sendKeys("naveen");
		c1.findElement(By.name("firstName")).sendKeys("naveen");
		c1.findElement(By.name("lastName")).sendKeys("naveen");
		c1.findElement(By.name("passwordText")).sendKeys("naveen");
		c1.findElement(By.name("passwordTextRetype")).sendKeys("naveen");
		c1.findElement(By.xpath("//input[@value='   Create User   ']")).click();
		String s1=c1.findElement(By.className("successmsg")).getText();
		System.out.println(s1);
		c1.findElement(By.linkText("naveen, naveen (naveen)")).click();
		c1.findElement(By.xpath("//input[@value='Delete this User']")).click();
		c1.switchTo().alert().accept();
		String s2=c1.findElement(By.className("successmsg")).getText();
		System.out.println(s2);
	}

}
