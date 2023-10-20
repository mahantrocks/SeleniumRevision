package Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	private WebElement signInBtn;
	private WebElement unTB;
	private WebElement cntnue;
	private WebElement pswdTB;
	private WebElement loginBtn;
	private WebElement signIn;
	
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		signInBtn=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		signIn=driver.findElement(By.xpath("(//span[@class='nav-action-inner' ])[1]"));
		unTB = driver.findElement(By.xpath("//input[@type='email' ]"));
		cntnue = driver.findElement(By.id("continue"));
		pswdTB = driver.findElement(By.name("password"));
		loginBtn = driver.findElement(By.id("signInSubmit"));
	}
	
	public void loginToAmazon(String un, String pwd) throws InterruptedException {
		Thread.sleep(100);
		signInBtn.click();
		signIn.click();
		unTB.sendKeys(un);
		cntnue.click();
		pswdTB.sendKeys(pwd);
		loginBtn.click();
		
	}
}


