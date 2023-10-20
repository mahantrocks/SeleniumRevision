package BasicsOfSelenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserInputTest {
	WebDriver driver;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Browser?");
		String input=sc.next();
		System.out.println("Browser is : "+input);
		
		if (input.equals("GC")) {
			
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver ();
			BrowserInputTest.executeBrowser(driver);
			
		} else {
			System.out.println("This not a expected Browsertype");
			
		}
		
		
		

	}
	
	public static void executeBrowser(WebDriver driver) {
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Broser Title is : "+title);
		
	}

}
