package BasicsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ExecuteSeleniumScriptByJavaScriptExecutorMethods {
	static WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		String url="https://www.vtiger.com/";
        driver.get(url);
        
       RemoteWebDriver js = (RemoteWebDriver)driver;
       
       
       WebElement element = driver.findElement(By.xpath("/html//span[@id='loginspan']"));
       js.executeScript("arguments[0].click();", element); 

    

	}

}
