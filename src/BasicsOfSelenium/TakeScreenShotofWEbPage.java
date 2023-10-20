package BasicsOfSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TakeScreenShotofWEbPage {
	
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	// TODO Auto-generated method stub

	public static void main(String[] args) throws IOException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//Takes a Screenshot of the webpage
	
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new File ("c://screenshot123.png");
	FileUtils.copyFile(src, dest);
	
		
		
		

	}
}


