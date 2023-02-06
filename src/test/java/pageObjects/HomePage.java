package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//Elements
	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement lnkMyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement lnkRegister;
	
	@FindBy(xpath="//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[2]/a") WebElement lnkLogin;
	
	//Actions Methods
	public void clickMyaccount() {
		lnkMyaccount.click();
	}
	
	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin() {
		lnkLogin.click();
	}
	

}
