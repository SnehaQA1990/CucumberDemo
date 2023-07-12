package POMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	static WebElement ele;
	public static WebElement txtusername(WebDriver driver)
	{
		return ele = driver.findElement(By.name("username"));
	}

	public static WebElement txtpassword(WebDriver driver)
	{
		return ele = driver.findElement(By.name("password"));
	}
	
	public static WebElement loginbtn(WebDriver driver)
	{
		return ele = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	}
}
