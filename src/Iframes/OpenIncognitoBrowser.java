package Iframes;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenIncognitoBrowser {

	public static void main(String[] args) {
		
  System.setProperty("webdriver.chrome.drivre", "./driver/chromedriver.exe");
  
  ChromeOptions option = new ChromeOptions();
  option.addArguments("--incognito");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String text=driver.getTitle();
		System.out.println(text);
		System.out.println(driver.getCurrentUrl());
		
		//Navigate to active element on the webpage.
		driver.switchTo().activeElement().sendKeys("Monty");
		
		// TODO Auto-generated method stub

	}

}
