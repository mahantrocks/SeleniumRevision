package BasicsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySignINButtonEnabled {
	static WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		String url="https://www.vtiger.com/";
        driver.get(url);
        //Verify Agree button in the wensite is enabled
       Boolean op=driver.findElement(By.xpath("//a[text()='Agree']")).isDisplayed();
       if(op==true) {
    	   System.out.println("Agree Button is enabled");
       }
       
       else {
    	   System.out.println("Agree Button is disabled");
    	   
       }
	

	}

}
