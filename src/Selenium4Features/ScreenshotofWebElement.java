package Selenium4Features;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotofWebElement {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}

	public static void main(String[] args) throws IOException {
		
	
			//WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			//Take a webtable element screenshot in 4.0 version of selenium 
			WebElement webtable=driver.findElement(By.id("customers"));
			
		File src=webtable.getScreenshotAs(OutputType.FILE);
		File des= new File("./screenshots/webtable.png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//mainLeaderboard
		WebElement header=driver.findElement(By.id("mainLeaderboard"));
		File source=header.getScreenshotAs(OutputType.FILE);
		File destination = new File ("./screenshots/header.png");
		FileUtils.copyFile(source, destination);
		
		driver.close();
			
		

	}

}
