package BasicsOfSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver ();
		String url="https://www.google.com";
	driver.get(url);
	driver.getCurrentUrl();
	
//		driver.navigate().to(url);
//		driver.navigate().refresh();
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.navigate().forward();
//		Set<String> adress =driver.getWindowHandles();
//		System.out.println("Address of WindowHandle is : "+adress);
		
		driver.getTitle();
		if(driver.getTitle().equalsIgnoreCase("Google")) {
			
			System.out.println("Pass");
			System.out.println(driver.getCurrentUrl());
			//System.out.println(driver.getPageSource());
			System.out.println(driver.toString());
			
		}
		
		else {
			System.out.println("Fail");
		}
		
		driver.quit();
		
		
	}

}
