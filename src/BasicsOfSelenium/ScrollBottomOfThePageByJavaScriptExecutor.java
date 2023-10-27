package BasicsOfSelenium;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBottomOfThePageByJavaScriptExecutor {

	
	    public static void main(String[] args) {
	    	
	    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	     
	        WebDriver driver = new ChromeDriver();

	        // Open a webpage
	        driver.get("http://news.google.com/");
	        driver.manage().window().maximize();

	        // Initialize the JavaScriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // Scroll to the bottom of the page
	      //  js.executeScript("window.scrollTo(0, document.body.scrollHeight/2);");
         js.executeScript("window.scrollTo(0,document.body.scrollHeight/2)");
         js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
         
	        // Close the browser
	        //driver.quit();
	    }
	}


