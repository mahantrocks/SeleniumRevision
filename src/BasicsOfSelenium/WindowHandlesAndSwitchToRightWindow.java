package BasicsOfSelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesAndSwitchToRightWindow {

	static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			String parentWindow = driver.getWindowHandle();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//a)[1]")).click();
			driver.findElement(By.xpath("(//a)[2]")).click();
			driver.findElement(By.xpath("(//a)[3]")).click();
			driver.findElement(By.xpath("(//a)[4]")).click();
			
			Set<String>allW=driver.getWindowHandles();
			List<String> listWindow = new ArrayList<String>(allW);
			
			System.out.println(listWindow.size());
			
			if(getRightWindow("Facebook",listWindow)) {
				
				System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle() );
			}
			
			closeAllWindow(parentWindow, listWindow);
			
			closeParentWindow(parentWindow);
				
			}
		
		public static boolean getRightWindow(String title, List<String> listwindow) {
			
			for (String w :listwindow) {
				
				String ttl = driver.switchTo().window(w).getTitle();
				//System.out.println("Title of the window is : "+ttl);
				if (ttl.contains(title)) {
					
					System.out.println("Title of the page : " +ttl);
					System.out.println("Found the Right Window--------");
					
					return true;
				}
							
			}
			return false;
	      

	}
		
		public static void closeAllWindow(String parentWindow, List<String> listwindow ) {
			
			for (String e :listwindow) {
				if (!e.equals(parentWindow)) {
					driver.switchTo().window(e).close();
				}
			}
			
		}
		
		public static void closeParentWindow(String parentWindow) {
			driver.switchTo().window(parentWindow).close();
			
			System.out.println("Closed Parent window successfullys");
		}
		
		
		
}
