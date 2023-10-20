package BasicsOfSelenium;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Variables.configProperties;

public class XYCordinatesANDLOCation {
	WebDriver driver ;
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	// TODO Auto-generated method stub

}
	


	public static void main(String[] args) throws FileNotFoundException {
		
		WebDriver driver =new ChromeDriver ();
		String url="https://www.vtiger.com/";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//span[@id='loginspan']")).click();
        
        //WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        configProperties.initializationPropertyFile();
        
        // retrive credentials from config properties file.
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(configProperties.property.getProperty("username"));
        //Thread.sleep(1000);
        
        // Get a location of an element for X() cordinate
        Point p=driver.findElement(By.xpath("//input[@name='username']")).getLocation();
      int  x=p.getX();
      int y=p.getY();
         System.out.println(p.getX());
         System.out.println(p.getY());
         JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeAsyncScript("window.scrollTo(x,y))";
         
         
        Dimension d=driver.findElement(By.xpath("//input[@name='username']")).getSize();

         System.out.println(d.getHeight());
         System.out.println(d.getWidth());
          
        //get font size of an element
        String fs =driver.findElement(By.xpath("//input[@name='username']")).getCssValue("font-size");
        System.out.println(fs);
        
        //Get font family of an element
        String ff =driver.findElement(By.xpath("//input[@name='username']")).getCssValue("font-family");
        System.out.println(ff);
        
        //Get font color of an element
        String fc =driver.findElement(By.xpath("//input[@name='username']")).getCssValue("color");
        System.out.println(fc);
      
      

 
        
        


}
}
