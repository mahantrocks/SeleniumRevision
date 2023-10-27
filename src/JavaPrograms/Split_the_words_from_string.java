package JavaPrograms;

public class Split_the_words_from_string {

	public static void main(String[] args) {
		 String inputString = "We have QA Automation requirements in our project";
		 System.out.println(inputString.toUpperCase());
		 String[] words=inputString.split(" ");
		 for (String w : words) {
			 System.out.println(" Words after split are : "+w);
		 }
		 
	}

}
