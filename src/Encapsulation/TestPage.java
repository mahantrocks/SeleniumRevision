package Encapsulation;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Variables.configProperties;

public class TestPage {
	public static WebDriver driver;
	

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		LogInPage l = new LogInPage (driver);
		configProperties.initializationPropertyFile();
		l.loginToAmazon(configProperties.property.getProperty("username"), configProperties.property.getProperty("password"));
		
	}

	

}
