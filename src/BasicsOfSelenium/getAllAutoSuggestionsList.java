package BasicsOfSelenium;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAllAutoSuggestionsList {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver ();
		String url="https://www.google.com";
        driver.get(url);
        driver.findElement(By.id("input")).sendKeys("Selenium");
        
               

}
}
