package DynamicWebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Dynamic_WebTable {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.drivre", "./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int count =rows.size();
		System.out.println(count);
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
String beforeXpath = "//*[@id='customers']/tbody/tr[";
String afterXpath = "]/td[1]";
		
		for (int i=2;i<=count;i++) {
			String actualXpath=beforeXpath+i+afterXpath;
			WebElement element =driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			
			if (element.getText().equals("Island Trading")) {
				System.out.println("Company Name : "+ element.getText() + "Is Found " );
				break;
			}
			
		}
		
		System.out.println("**************************************");
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[4]/td[2]
		
		String contactafterXpath="]/td[2]";
		for (int i=2;i<=count;i++) {
			String actualXpath=beforeXpath+i+contactafterXpath;
			WebElement element =driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
						
		}
		
		System.out.println("**************************************");
		
		String countryAfterXpath="]/td[3]";
		for (int i=2;i<=count;i++) {
			String actualXpath=beforeXpath+i+countryAfterXpath;
			WebElement element =driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
						
		}
		
		System.out.println("**************************************");
		
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		
		List<WebElement>col=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		    int colcount=col.size();
		    System.out.println("Total numbers of columns are :"+colcount);
		String colbeforeXpath="//*[@id='customers']/tbody/tr[1]/th[";
		String colAfterXpath="]";
		
		System.out.println("Total columns are :");
		for (int i=1;i<=colcount;i++) {
			String actualXpath=colbeforeXpath+i+colAfterXpath;
			WebElement element =driver.findElement(By.xpath(actualXpath));
			
			System.out.println(element.getText());
						
		}
		
	}

}
