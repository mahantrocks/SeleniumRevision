package InterviewQuestions;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDulicateCharacterFromString {

	public static void main(String[] args) {
		
		
	String input = "Automation Engineer";
//	char chaArray[] =input.toCharArray();
//		
//		Map<Character,Integer> result = new HashMap<Character,Integer>();
//		StringBuffer sb = new StringBuffer();
//		
//		//char ch[] =input.toCharArray();
//		
//		for (int i=0;i<input.length();i++) {
//			
//			char ch =input.charAt(i);
//			if (!result.containsKey(ch)) {
//				
//				result.put(ch, 1);
//				
//				}
//			
//			else {
//				sb.append(ch);
//			}
//				
//			}
//		System.out.println(result);
//		System.out.println("Duplicate character in the given String are :" + sb);
//		
//		
//		
//		System.out.println("UniqueValue");
	
	
	String input1= "Subbi become so naughty now a days";
	char ch[] =input1.toCharArray();
	int count =0;
	StringBuffer sb = new StringBuffer ();
		
	for (int i=0;i<input1.length();i++) {
		for (int j=i+1;j<input1.length();j++) {
		 
				if (ch[i]==ch[j]) {
					sb.append(ch[j]);
					System.out.println(ch[i]);
					
				}			
			
		}
	}
	
	System.out.println(sb);
	System.out.println();
		}
		
		
		
		



	}


