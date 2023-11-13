package Selenium4Features;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getScreenshotOfRegisterForm {

	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exE");
	
}

	public static void main(String[] args) throws IOException, InterruptedException {
		
	
			//WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://api.cogmento.com/register/");
			
//			//Take a webtable element screenshot in 4.0 version of selenium 
//			//driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
//			Thread.sleep(2000);
//			WebElement registerForm=driver.findElement(By.cssSelector(".ui.form"));
//			
//			File src=registerForm.getScreenshotAs(OutputType.FILE);
//			File des = new File("./screenshots/reister.png");
//			
//		   FileUtils.copyFile(src, des);
			
		

}
}
