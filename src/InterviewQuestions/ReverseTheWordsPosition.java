package InterviewQuestions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReverseTheWordsPosition {

	public static void main(String[] args) {
		
//		String input = "Mahant is an Automation Engineer";

//		
//		String[] result=input.split("\\s");
//		
//		
//	StringBuffer sb= new StringBuffer();
//	
//	for (int i=result.length-1;i>=0;i-- ) {
//		sb.append(result[i]).append(" ");
//	}
//	
//	System.out.println(sb);
//	// TODO Auto-generated method stub

		
	String input1="Automation";
char[] ch=	input1.toCharArray();
	
	Arrays.sort(ch);
	for (char c:ch) {
	System.out.println(c);
	}
		
		
		
	
}}

