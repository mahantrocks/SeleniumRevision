package KannadaRajyotsavaPractise;

import java.util.List;

import dev.failsafe.internal.util.Assert;

public class GenerelLogic {

	public static void main(String[] args) {
		
		//remove the duplicate characters from below given String
		
//		String s = "Selenium Automation";
//		StringBuffer sb = new StringBuffer();
//		
//		int count =0;
//		char[] ch = s.toCharArray();
//		for (int i=0;i<=ch.length;i++) {
//			
//			for (int j=i+1;j<ch.length;j++) {
//				if(ch[i]==ch[j]) {
//					count++;
//					System.out.println(ch[j]);
//					sb.append(ch[j]);
//				}
//			}
//		}
//		System.out.println("Duplicate characters are : " +sb);
		
		
		System.out.println("**********************************************************************************************");	
		
		// Count the number of words in the below Sring. Please refer 'Count_Words' class login 
		
		// Count the number of Words with inbuilt method 
		
//		String string = "Java Selenium Python cucumber";
//		
//		int WordCount=0;
//		//split the words into String Array.
//		String[] words=string.split(" ");
//		for (String word:words) {
//			WordCount++;
//		}
//		
//		System.out.println("Number of words with buitIn method are :"+WordCount);
		
		System.out.println("**********************************************************************************************");
		
		//Print the ascii values from Each character
		
//		String avalue ="Automation";
//		char[] asc =avalue.toCharArray();
//		
//		
//		for (int i=0;i<asc.length;i++) {
//			
//			int asciiValue =(int) asc[i];
//			System.out.println("Ascii value of "+asc[i]+" is :"+asciiValue);
//			
//		}
		
		
		System.out.println("**********************************************************************************************");	
		
		//Check for the given String is Palindrome  with Inbuilt Method
		
		
//		String input = "GadaG";
//		StringBuilder sbldr = new StringBuilder(input);
//		String reverse=sbldr.reverse().toString();
//		
//		if (input.equalsIgnoreCase(reverse)) {
//			System.out.println(input + " Is a Palindrome");
//		}
//		else {
//			System.out.println(input + " Is not a Palindrome");
//		}
		
		
		System.out.println("**********************************************************************************************");	
		
		//Check for the given String is Palindrome  without Inbuilt Method
		
		String input = "GadaG";
		
		StringBuilder sb = new StringBuilder();
      
		for (int i=input.length()-1;i>=0;i--) {
			
			char ch=input.charAt(i);
			sb.append(ch);
			
		}
		
		if (input.equals(sb.toString())) {
			System.out.println(input + " is Palindrome");
		}
		
		else {
			System.out.println(input +" is not a palindrome");
			
		}
		
		
		
		

	}

}
