package Hybridframework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewcustomerpage {

	@FindBy(name="name")
	private WebElement CustomernameinTextfield;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement createCustomerButton;
	
	
	public AddNewcustomerpage()
	{
		PageFactory.initElements(Baseclass.driver,this);
	}
	
	public void enterCustomernameinCustomernameTextfield(String customername)
	{
		CustomernameinTextfield.sendKeys(customername);
	}
	public void clickOncreateCustomerButton()
	{
		createCustomerButton.click();
	}
}
