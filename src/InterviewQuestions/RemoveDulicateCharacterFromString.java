package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDulicateCharacterFromString {

	public static void main(String[] args) {
		
		
		String input = "Automation Engineer";
		
		Map<Character,Integer> result = new HashMap<Character,Integer>();
		StringBuffer sb = new StringBuffer();
		
		//char ch[] =input.toCharArray();
		
		for (int i=0;i<input.length();i++) {
			
			char ch =input.charAt(i);
			if (!result.containsKey(ch)) {
				
				result.put(ch, 1);
				
				}
			
			else {
				sb.append(ch);
			}
				
			}
		System.out.println(result);
		System.out.println("Duplicate character in the given String are :" + sb);
		
		}
		
		
		
		



	}


