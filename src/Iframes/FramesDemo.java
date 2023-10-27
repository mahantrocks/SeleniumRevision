package Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drivre", "./driver/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
	     driver.findElement(By.id("name")).sendKeys("Mahant");
	     System.out.println("Totle of the Page "+driver.getTitle());
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		//get the Course list
		Select select = new Select(driver.findElement(By.id("couse")));
		select.selectByVisibleText("Java");

	}

}
