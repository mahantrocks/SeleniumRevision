package BasicsOfSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CountNumberOfLinks {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	
	public static void main(String[] args) {
				
		//Find and Verify all the elements in the flifcart websites
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
	List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
	int count =allLinks.size();
	for (int i=0;i<count;i++) {
		String text=allLinks.get(i).getText();
		if(text.equals("Appliances")) {
			
			break;
			
		}
		System.out.println(text);	
	}
	System.out.println(count);	
		
		
	}

}
