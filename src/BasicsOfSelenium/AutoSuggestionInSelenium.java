package BasicsOfSelenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionInSelenium {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	// TODO Auto-generated method stub

	public static void main(String[] args) throws IOException, InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Go to the Search box of Amazon
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung m51");
		Thread.sleep(3000);
		
		List<WebElement> listBox=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
      System.out.println(listBox.size());
      
      for (WebElement we:listBox) {
    	
    	if (we.getText().equals("samsung m51 back cover")) {
    		we.click();
    	}
      }
	
	
	
	}
}