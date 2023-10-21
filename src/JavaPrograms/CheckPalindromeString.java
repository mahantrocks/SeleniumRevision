package JavaPrograms;

public class CheckPalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "racecar";
		
		String reverse = new StringBuilder(s).reverse().toString();
//		System.out.println(sb);
//		String reverse=sb.reverse().toString();
		System.out.println(reverse);
		System.out.println(s);
		if (s.equals(reverse)) {
			System.out.println(s + " is an Palindrome");
		} else {
			System.out.println(s+" is not an Palindrome");
		}

	}

}
