package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleBySelenium {
	public static String parent;
	public static String child;
	 public static WebDriver driver;
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.salesforce.com/au/");
		 driver.findElement(By.xpath("//main[@id='main-content']/div[2]/section//article/div[2]/div/pbc-button[1]/a[@href='/au/form/signup/freetrial-sales/?d=jumbo1-btn-ft']")).click();
		// TODO Auto-generated method stub
      Set<String>windowHandles=driver.getWindowHandles();
      System.out.println(windowHandles);
      
    	  Iterator<String> iterator=windowHandles.iterator();
    	  parent=iterator.next();
    	  child=iterator.next();
            System.out.println("WindowHandle is "+driver.getWindowHandle());
      driver.switchTo().window(child);
      System.out.println("WindowHandle is "+driver.getWindowHandle());
     //((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[contains(@id,'UserFirstName')]")));
    			
		 driver.findElement(By.xpath("//input[contains(@id,'UserFirstName')]")).sendKeys("Mahant");
		 driver.findElement(By.name("UserLastName")).sendKeys("Madiwal");
		 System.out.println("Child WindowTitle "+ driver.getTitle());
		 driver.switchTo().window(parent);
		 System.out.println("Parent WindowTitle "+driver.getTitle());
		
	}

}
