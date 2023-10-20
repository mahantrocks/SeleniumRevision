package JavaPrograms;

import java.util.Scanner;

public class CountTheNumberOfWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the string which you would like kow the word count");
        String str =sc.nextLine();
        
             
        int count=1;
        for (int i=0;i<str.length();i++) {
        	if ((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')){
        		
        		count++;
        		
        	}
        	
        }
        System.out.println("Number of words in the String are : "+count);
	}

}
