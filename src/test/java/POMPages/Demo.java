package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException 
	{
		
       WebDriver driver = new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
       
       Thread.sleep(5000);
       LoginPage.txtusername(driver).sendKeys("Admin");
       LoginPage.txtpassword(driver).sendKeys("admin123");
       LoginPage.loginbtn(driver).click();
	}

}
