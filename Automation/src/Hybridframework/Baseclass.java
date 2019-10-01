package Hybridframework;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public static WebDriver driver;
	@BeforeTest
	public void openbrowser()
	{
		String browser=Exceloperation.readdata("baseclass",1,0);
		System.out.println("browser");
		String url=Exceloperation.readdata("baseclass",1,1);
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
	@BeforeClass()
	public void login()
	{
		String username=Exceloperation.readdata("baseclass",1,2);
		String password=Exceloperation.readdata("baseclass",1,3);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@AfterClass
	public void logout()
	{
		driver.findElement(By.className("logoutimg")).click();
	}
	}

