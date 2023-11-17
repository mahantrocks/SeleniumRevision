package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountTheNumberOfDuplicateWords {

	public static void main(String[] args) {
		
		String input = "Java is a good but Java is not as good as python";
		// TODO Auto-generated method stub
		
		getDuplicateWordsCount(input);

	}
	
	public static void getDuplicateWordsCount(String inputString) {
		String[] words =inputString.split(" ");
		
		Map<String,Integer> wordsCount = new HashMap<String,Integer>();
		
		for (String word : words) {
			
			if (wordsCount.containsKey(word)) {
				wordsCount.put(word, wordsCount.get(word)+1);
			}
			
			else {
				wordsCount.put(word, 1);
			}
			
		}
		
		Set<String> wordKeys=wordsCount.keySet();
		
		for (String wordKey : wordKeys) {
			if (wordsCount.get(wordKey)>1) {
				System.out.println(wordKey + "-----" + wordsCount.get(wordKey) );
			}
		}
		
		
		
		
	}

}
