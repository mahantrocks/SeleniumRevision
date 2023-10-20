package BasicsOfSelenium;

import org.openqa.selenium.JavascriptExecutor;

public class ExceptionHandlingBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=5;
		int j=0;
		
		try {
			System.out.println(i/j);
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}

	}
	
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("document.getElementById('').value='xyz123'");

}
