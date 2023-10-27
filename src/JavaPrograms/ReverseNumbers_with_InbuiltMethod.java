package JavaPrograms;

public class ReverseNumbers_with_InbuiltMethod {

	public static void main(String[] args) {
		
		int number =12345;
		System.out.println(number);
		String numberString=Integer.toString(number);
		
		
		StringBuilder sb= new StringBuilder(numberString);
		sb.reverse();
		System.out.println(sb);
		//System.out.println(reverse);

	}

}
