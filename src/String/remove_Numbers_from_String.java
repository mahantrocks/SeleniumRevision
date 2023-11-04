package String;

import java.awt.SystemTray;
import java.util.Collections;

public class remove_Numbers_from_String {

	public static void main(String[] args) {
	String inputString ="My Name is Mahants 12345";
	StringBuffer sb = new StringBuffer();
//		System.out.println("This is the input String : "+inputString);
//		
//		String removeSpace=inputString.replaceAll("\\s", "");
//		System.out.println("This is the String after removal of white space : "+removeSpace);
		
	
	
	 for (int i=0;i<inputString.length();i++) {
		 char c=inputString.charAt(i);
		 
		 if (!Character.isDigit(c)) {
			 sb.append(c);
			 
		 }
		 
	 }
	 
	 System.out.println(" String after removing of Number " + sb.toString());

	}

}
