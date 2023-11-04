package ThreadLocalClass;
import org.openqa.selenium.WebDriver;

public class DriverManager {
//    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();
//
//    public static WebDriver getDriver() {
//        return webDriver.get();
//    }
//
//    public static void setDriver(WebDriver driver) {
//        webDriver.set(driver);
//    }
//
//    public static void removeDriver() {
//        webDriver.remove();
//    }
	
	String str1 = "Hello";
	String str2 = "Hello";
	String str3 = new String("Hello");

	boolean result1 = (str1 == str2); // true, as both refer to the same string literal
	boolean result2 = (str1 == str3); // false, as str3 refers to a new string object
	
	String input ="Java Automation";
	
	// o/p: avaJ noitamotuA
	StringBuilder sb = new StringBuilder(input);

	
	

}
