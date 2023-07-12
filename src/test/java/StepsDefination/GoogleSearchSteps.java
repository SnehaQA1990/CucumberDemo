package StepsDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void verifyBrowser()
	{
		System.out.println("Inside steps - browser is open");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
	}
	
	@And("User is on google search page")
	public void VerifyGooglesearchpage() 
	{
		System.out.println("Inside steps - user is on google serach page");
		driver.navigate().to("https://google.com");
	}

	@When("User enters a text in search box")
	public void verifyTextSearchBox()
	{
		System.out.println("Inside steps - User enter in search box");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
	}
	
	@And("hints enter")
	public void VerifyEnter()
	{
		System.out.println("Inside steps - hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	@Then("User is navigate to search result")
	public void verifySearchResult()
	{
		System.out.println("Inside steps - user navigate to search result");
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	}
	
}
