package Hybridframework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Addnewprojectpage {

	@FindBy(name="customerId")
	private WebElement customerdropdown;
	
	@FindBy(name="name")
	private WebElement projectnameinTextfield;
	
	@FindBy(name="createProjectSubmit")
	private WebElement createprojectButton;
	
	
	public Addnewprojectpage()
	{
		PageFactory.initElements(Baseclass.driver,this);
	}
	
	public void selectcustomernamefromdropdown(String customername)
	{
     Select s1=new Select(customerdropdown);
     s1.selectByVisibleText(customername);
	}
	public void enterprojectnameinTextfield(String customername)
	{
		projectnameinTextfield.sendKeys(customername);
	}
	public void clickonCreateprojectButton()
	{
		createprojectButton.click();
	}
}
