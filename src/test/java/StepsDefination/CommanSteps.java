package StepsDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommanSteps {
	
	private WebDriver driver;
	
	{
		System.out.println("set cookies executed");
	}
	@Before(order=1)
	public void setup()
	{
		driver = new ChromeDriver();
	}
	
	@After(order=1)
	public void teardown()
	{
		driver.close();
	}
	@Before(value="@setcookies", order=0)
	public void setcookies()
	{
		System.out.println("set cookies executed");
	}
	
	public WebDriver getDriver()
	{
		return driver;
		
	}
}
