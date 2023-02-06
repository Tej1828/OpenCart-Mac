package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
	
	WebDriver driver;
	
	public RegistrationPage (WebDriver driver)
	{
		super(driver);
	}
	
	//Elements
	@FindBy(xpath="//input[@id='input-firstname']") WebElement txtFirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txtLastname;
	
	@FindBy(xpath="//input[@id='input-email']") WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-password']") WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='agree']") WebElement chkdPolicy;
	
	@FindBy(xpath="//button[normalize-space()='Continue']") WebElement btnConinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	//Actions
	public void setFirstname(String fname) {
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastname(String lname) {
		txtLastname.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
		
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
		
	}
	
	public void setPrivacyPolicy() {
		chkdPolicy.click();

	}
	
	public void clickButton() {
		btnConinue.click();

	}
	public String getmsgConfm() {
		try 
		{
		return(msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	

}
