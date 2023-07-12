package POMPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePF extends Base{
	
	public LoginPagePF(WebDriver driver) 
	{
	     super(driver);
	}
	
	@FindBy(name="username")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement btnLogin;

	public void setusername(String un)
	{
		txtusername.sendKeys(un);
	}
	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		btnLogin.click();
	}
}
