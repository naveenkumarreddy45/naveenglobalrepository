package Hybridframework;

import org.testng.Assert;

public class Validationoperation {
public static String validatetestscript(String exp,String act)
{
	try {
		Assert.assertEquals(exp,act);
		return"pass";
	}
	catch(AssertionError rv)
	{
		return"fail";
	}
}
}

