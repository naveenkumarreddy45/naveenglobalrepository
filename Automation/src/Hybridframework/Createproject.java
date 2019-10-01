package Hybridframework;

import org.testng.annotations.Test;

public class Createproject {
@Test
public void testCreateproject()
{
	String customername=Exceloperation.readdata("createproject",1,0);
	String projectname=Exceloperation.readdata("createproject",1,1);
	String expectedresult=Exceloperation.readdata("createproject",1,2);
	Opentaskpage otp=new Opentaskpage();
	otp.clickOnprojectsAndCustomers();
	ActiveprojectsAndcustomerspage apcp=new ActiveprojectsAndcustomerspage();
	apcp.clickonAddnewprojectButton();
	Addnewprojectpage anpp=new Addnewprojectpage();
	anpp.selectcustomernamefromdropdown(customername);
	anpp.enterprojectnameinTextfield(projectname);
	anpp.clickonCreateprojectButton();
	String actualresult=apcp.retrieveSuccessmessage();
	String status=Validationoperation.validatetestscript(expectedresult, actualresult);
	Exceloperation.writedata("createproject",1,3,actualresult);
	Exceloperation.writedata("createproject",1,4,status);

}
}
