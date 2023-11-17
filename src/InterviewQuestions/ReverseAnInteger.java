package InterviewQuestions;

public class ReverseAnInteger {

	public static void main(String[] args) {
		
		
	long number = 12345678;
	
	long rev=0;
	
	while (number !=0) {
		rev = rev*10 + number%10;
		number=number/10;
	}
	
	System.out.print("Reverse num is :"+rev);
	
		// TODO Auto-generated method stub

	}

}
