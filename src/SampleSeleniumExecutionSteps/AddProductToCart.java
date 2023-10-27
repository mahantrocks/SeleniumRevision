package SampleSeleniumExecutionSteps;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProductToCart {

	static {
		System.setProperty("webdriver.driver.chrome", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//Open the browser
		WebDriver driver = new ChromeDriver();
		String parentWindow =driver.getWindowHandle();
		
	    //Maximize the window
		driver.manage().window().maximize();
		//add implicitely wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Enter the url
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		//Go to the Search box of Amazon
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung m51");
		Thread.sleep(3000);
		//Click on Search icon 
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String xpath="(//span[contains(text(),'Samsung Galaxy M34 5G (Prism Silver,8GB,128GB)|120Hz sAMOLED Display|50MP Triple No Shake Cam|6000 mAh Battery|4 Gen OS Upgrade & 5 Year Security Update|16GB RAM with RAM+|Android 13|Without Charger')])[2]";
	    
		//Find Smasung m51 mobile from the search results
		WebElement samsungM51=driver.findElement(By.xpath(xpath));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(samsungM51));
		
		//Click on SamSung m51 mobile
		samsungM51.click();
	
		// Click on Add Cart button 
		Set<String> whls=driver.getWindowHandles();
		
		Iterator<String> iterator =whls.iterator();
	 String	parent=iterator.next();
	 String child=iterator.next();
	 driver.switchTo().window(child);
	 Actions action = new Actions(driver);
	 
	WebElement  addToCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button'"));
	action.doubleClick(addToCart).build().perform();
	 System.out.println("clicked on cart button");
		driver.findElement(By.id("nav-cart")).click();	
		
//		for (String window:whls) {
//			if (!driver.getTitle().contains("Amazon.in : Samsung m51"));
//			driver.switchTo().window(window);
//			System.out.println("Title od the window is : "+driver.getTitle());
//			if (!driver.getTitle().contains("Amazon.in : Samsung m51"));
//    driver.findElement(By.id("add-to-cart-button")).click();
//	    Thread.sleep(5000);
//
//		}
	//	if (driver.getTitle().contains("Samsung Galaxy M34 5G (Prism Silver,8GB,128GB)|120Hz sAMOLED Display|50MP Triple No Shake Cam|6000 mAh Battery|4 Gen OS Upgrade & 5 Year Security Update|16GB RAM with RAM+|Android 13|Without Charger"));
		
		
		
		
		
		
	
		// TODO Auto-generated method stub

	}

}
