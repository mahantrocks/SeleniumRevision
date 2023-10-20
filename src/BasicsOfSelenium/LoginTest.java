package BasicsOfSelenium;

import org.testng.annotations.Test;

import Variables.configProperties;

import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	
	WebDriver driver ;
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
  @Test
  public void logintoAmazon() {
	  
	            driver = new ChromeDriver();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  	        driver.get(configProperties.property.getProperty("appUrl")); 
	 	        driver.findElement(By.xpath("(//span[text()='Sign in'])[2]")).click();
	 			driver.findElement(By.xpath("//input[@id='ap_email' and @name='email']")).sendKeys(configProperties.property.getProperty("username"));
	 		
	 			driver.findElement(By.xpath("//span[@id='continue']")).click();
	 			driver.findElement(By.xpath("//input[@name='password' and @type='password']")).sendKeys(configProperties.property.getProperty("password"));
	 			driver.findElement(By.xpath("//input[@id='signInSubmit' and @type='submit']")).click();
	 	       }
	         
  @BeforeMethod
  public void beforeMethod() throws FileNotFoundException {
	  Reporter.log("Before Method executed successfully");
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  configProperties.initializationPropertyFile();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("Before Method executed successfully");
	  //driver.quit();
	
  }

}
