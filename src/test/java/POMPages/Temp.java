package POMPages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Temp {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		 File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 Files.copy(scrfile, new File("C:\\Users\\SnehaR4\\Software\\Cucumber_Demo\\screenshot\\google.png"));
		 
		 Thread.sleep(2000);
	}

}
