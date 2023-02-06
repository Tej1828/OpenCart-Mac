package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {
	
	@Test(groups= {"Regression","Master"}) //Step8 groups added
	public void test_account_registration() {
		
		logger.info("*** TC_001_AccountRegistrationTest ***");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyaccount();
		logger.info("Clicked on MyAccount");
		
		hp.clickRegister();
		logger.info("Clicked on Register");
		
		RegistrationPage repage=new RegistrationPage(driver);
		
		repage.setFirstname(randomString().toUpperCase()); //randomly generated first name
		
		repage.setLastname(randomString().toUpperCase()); // randomly generated last name
		
		repage.setEmail(randomString()+"@gmail.com"); //randomly generated the email
		
		// For Password 
		//password and confirm password should be same so we create a password variable and store the value and pass the value of varaible
//		String password=randomAlphaNumeric();
//		regpage.setPassword(password);
//		regpage.setConfirmPassword(password);
		
		repage.setPassword(alphanumeric());
		logger.info("Provided user info");
		
		repage.setPrivacyPolicy();
		
		repage.clickButton();
		logger.info("Clicked on ");
		repage.getmsgConfm();
		
		String conMsg= repage.getmsgConfm();
		AssertJUnit.assertEquals(conMsg, "Your Account Has Been Created!");
		
		}
		catch(Exception e)
		{
			AssertJUnit.fail();
		}
		
		logger.info("***  Finished TC_001_AccountRegistrationTest ***");		
		
		
	
	
	}
	

}
