package StepsDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMPF.LoginPagePF;
import POMPages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class LoginSteps {
	
	WebDriver driver;
	LoginPage lp = new LoginPage();
	public LoginSteps(CommanSteps s)
	{
		this.driver = s.getDriver();
	}
	
	@Given("Lunch Application")
	public void verfiyLoginPage()
	{
		System.out.println("Inside steps-user is on login page");
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@When("I enter {string} and {string}")
	public void verifyUserDetails(String un ,String pwd) throws InterruptedException 
	{
		Thread.sleep(5000);
        //driver.findElement(By.name("username")).sendKeys(un);
		//driver.findElement(By.name("password")).sendKeys(pwd);
		lp.txtusername(driver).sendKeys(un);
		lp.txtpassword(driver).sendKeys(pwd);
	
		
	}
	@And("click on Login button")
	public void verifyLoginButton() throws InterruptedException
	{
		System.out.println("Inside steps- Click on login button");
		//driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		lp.loginbtn(driver).click();
		
	}
	
	@Then("Dashboard should be display")
	public void userNavigatedto() throws InterruptedException
	{
		System.out.println("Inside steps-Navigate to the Dashboard");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
