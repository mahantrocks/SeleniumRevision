package InterviewQuestions;

public class ReverseString2 {

	public static void main(String[] args) {
	
		String input="Automation Engineer";
		
		//Without using any inbuilt methods
		String rev="";
		
		for (int i=input.length()-1;i>=0;i--) {
			rev = rev + input.charAt(i);
		}
		System.out.println(rev);
		
		//Using inbuilt methods
		
		StringBuffer sb = new StringBuffer(input);
		System.out.println(sb.reverse());

	}

}
