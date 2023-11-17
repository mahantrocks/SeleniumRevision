package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		
		
		// Set does not allow to store duplicate and  null values 
//		Set<String> set = new HashSet<String>();
//		set.add(null);
//		set.add(null);
//		set.add("c");
//		set.add("mahant");
//		set.add("mahant");
//		set.add("a");
//		System.out.println(set.size()+"---"+set );
//		// TODO Auto-generated method stub

		// Remove duplicate characters
//		Map<Character,Integer> result = new HashMap<Character, Integer>();
//		StringBuilder sb = new StringBuilder();
//		String input= "Automation is a one of the best technology";
//	char Array[] =input.toCharArray();
//		
//		for (int i=0;i<Array.length;i++) {
//			if (!result.containsKey(Array[i])) {
//				result.put(Array[i], 1);
//			}
//			else {
//				sb.append(Array[i]).toString();
//				
//			}
//		}
//		
//		System.out.println(result);
//		System.out.println(sb);
		
		
		
		
		// Remove number of duplicate words in the Given String 
		
//		String input = "Java is Java but Python is Python";
//		
//		String words[] =input.split(" ");
//		Map<String,Integer> result = new HashMap<String,Integer>();
//		for (String word:words) {
//			
//			if (result.containsKey(word)) {
//				result.put(word, result.get(word)+1);
//			}
//			else {
//				result.put(word, 1);
//			}
//			
//			Set<String>wordKeys=result.keySet();
//			for (String key:wordKeys) {
//				if (result.get(key)>1) 
//					
//				System.out.println( key + "---" + result.get(key).toString());
//			}
//			
//		}
		
		
//		// Count the number of words in the given String 
//		
//		String input = "Mahant Madiwal need to work on his overall skills";
//		
//		String words[]=input.split(" "); // Inbuilt method 
//		System.out.println(words.length); 
//		
//		int count=1;
//		
//	
//			
//			
//		
//		
//		// Without inbuilt method 
//		
//		
//	for (int i=0;i<input.length();i++) {
//		
//		if( (input.charAt(i)==' ') &&( input.charAt(i+1)!=' ') )  {
//			
//			count ++;
//			
//			
//		}
//		
//		
//		
//	}
//	
//	System.out.println(count);
		
		
		// Reverse the String words 
		
		
//		String input = "Java Automation";
//		//StringBuffer sb = new StringBuffer();
//		String rev="";
//		
//		String words[] =input.split(" ");
//		
//		for (String word : words) {
//			StringBuffer sb = new StringBuffer(word);
//			sb.reverse();
//			rev+=sb.toString()+" ";
//			
//			
//		}
//		
//		System.out.println(rev);
		
		// Reverese the given integer
		
//		long number = 12345;
//		
//		long rev=0;
//		 while (number!=0) {
//			 rev=rev*10+number%10;
//			 number =number/10;
//		 }
//		 
//		 System.out.println(rev);
		
		//Reverse the given String without making use of any inbuilt method
		
//		String input = "Automation is an Automation Engineer";
//		String reverse ="";
//		
//		for (int i=input.length()-1;i>=0 ;i--) {
//			reverse = reverse + input.charAt(i);
//		}
//		
//		System.out.println(reverse);
		
		//Remove duplicate characters from the given string 
		
//		String input = "Automation Engineer";
//		
//		Set<Character> ch = new HashSet<Character>();
//		StringBuffer sb = new StringBuffer();
//		
//		for (int i=0;i<input.length();i++) {
//			
//			ch.add(input.charAt(i));
//			sb.append(input.charAt(i));
//			
//		}
//		
//		System.out.println(ch);
//		System.out.println(sb);
		
		
		
		int n=5;
		int result=0;
		
		for (int i=0;i<n;i++) {
			result =result+i;
		}
		
		System.out.println(result);

}}
