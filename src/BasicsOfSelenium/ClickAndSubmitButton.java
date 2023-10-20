package BasicsOfSelenium;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Variables.configProperties;

public class ClickAndSubmitButton extends configProperties {

	
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
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(configProperties.property.getProperty("username"));
        //Thread.sleep(1000);
        //driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        driver.findElement(By.name("password")).sendKeys(configProperties.property.getProperty("password"));
        //driver.findElement(By.name("password")).sendKeys(Keys.CONTROL+"ac"+Keys.CONTROL+"v");
        String av=driver.findElement(By.name("password")).getAttribute("name");
        System.out.println("Attribute value of the password field is : "+av);
        driver.findElement(By.xpath("//button[text()='Sign in']")).sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Boolean bool=driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText().equalsIgnoreCase("Invalid credentials");
        
        if (bool==true) {
        	System.out.println("Test Case Pass");
        }
        
        else {
        	System.out.println("Test Case Fail");
        }
        driver.quit();
	}

}
