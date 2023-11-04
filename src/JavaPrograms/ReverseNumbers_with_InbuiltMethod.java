package JavaPrograms;

public class ReverseNumbers_with_InbuiltMethod {

	public static void main(String[] args) {
		
		
		
		// Remove numbers from the given String with inbuilt method 
		
		String s = "Mahant1234";
		char[] ch=s.toCharArray();
		StringBuffer sb = new StringBuffer();
		String removeNumber=s.replaceAll("\\d", "");
		System.out.println(removeNumber);

//		// Remove numbers from the String without using inbuild Method
//		
//		for (int i=0;i<ch.length;i++){
//		if (!Character.isDigit(ch[i])){
//		sb.append(ch[i]);
//		}}
//		
//		System.out.println(sb);
//		
		int number =12345;
		System.out.println(number);
		String numberString=Integer.toString(number);
		
		
		StringBuilder sb1= new StringBuilder(numberString);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.reverse());

	}
	}


