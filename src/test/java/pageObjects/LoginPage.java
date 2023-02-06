package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']") WebElement txtEmailaddress;
	
	@FindBy(xpath="//input[@id='input-password']") WebElement txtPassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btnLogin;
	
	
	
	public void setEamil(String Email) 
	{
		txtEmailaddress.sendKeys(Email);
	}
	
	public void setPassword(String Password) 
	{
		txtPassword.sendKeys(Password);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	

}
