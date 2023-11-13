package BasicsOfSelenium;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Variables.configProperties;

public class SendValueWithoutUsingSendKeys {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver ();
		String url="https://www.vtiger.com/";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//span[@id='loginspan']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        configProperties.initializationPropertyFile();
        
      //  WebElement unTxt=driver.findElement(By.xpath("//input[@name='username']"));
        String c = "document.getElementByName('username').value='abc';";
        RemoteWebDriver js = (RemoteWebDriver)driver;
        
        
        
        
}
}
