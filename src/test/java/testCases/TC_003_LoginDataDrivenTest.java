package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDataDrivenTest extends BaseClass{
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void LoginDDTest(String email, String pwd, String exp) throws InterruptedException {
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickMyaccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEamil(email);
		lp.setPassword(pwd);
		lp.clickLogin();
		
		Thread.sleep(5000);
		
		MyAccountPage myacc = new MyAccountPage(driver);
		
		boolean status = myacc.isMyaccountExists();
		
		if(exp.equals("valid")) {
			if(status==true) {
				myacc.clickLogout();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}
		if (exp.equals("Invalid")) {
			if (status == true) {
				MyAccountPage myaccpage = new MyAccountPage(driver);
				myaccpage.clickLogout();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
		}
		}
		catch(Exception e)
		{
			Assert.fail();
		}

		
	}

}
