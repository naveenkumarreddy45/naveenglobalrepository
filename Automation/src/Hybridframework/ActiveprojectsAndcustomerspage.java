package Hybridframework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveprojectsAndcustomerspage {
    @FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement AddnewcustomerButton;
	
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement AddnewprojectButton;
	
	@FindBy(className="successmsg")
	private WebElement successMessage;
	
	public ActiveprojectsAndcustomerspage()
	{
		PageFactory.initElements(Baseclass.driver, this);
	}
	public void clickonAddNewcustomerButton()
	{
		AddnewcustomerButton.click();
	}
	public void clickonAddnewprojectButton()
	{
		AddnewprojectButton.click();
	}
		public String retrieveSuccessmessage()
		{
		String s=successMessage.getText();
		return s;
	}
	
	
}
