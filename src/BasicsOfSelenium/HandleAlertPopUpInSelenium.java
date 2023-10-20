package BasicsOfSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopUpInSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Click on Sign-In button to get a alert pop up
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    // As Alert pop up has only Ok button hence both accept and dismiss methods clicks on OK button
	    //alert.accept();
        alert.dismiss();
	}

}
