package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{
	
	@Test(groups= {"Sanity","Master"}) //Step8 groups added
	public void testLogin() {
		
		logger.info("Starting TC_002_LoginTest");
		
		try 
		{
		HomePage hp = new HomePage(driver);
		hp.clickMyaccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEamil("sampleaccount@gmail.com");
		lp.setPassword("Test@123");
		lp.clickLogin();
		
		Thread.sleep(5000);
		
		MyAccountPage myacc = new MyAccountPage(driver);
		
		boolean status = myacc.isMyaccountExists();
		
		Assert.assertEquals(status, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
	}
	

}
