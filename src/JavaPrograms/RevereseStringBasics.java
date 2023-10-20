package JavaPrograms;

public class RevereseStringBasics {
	
	
	
	public static void main(String[] args) {
		
		String s = "Hello World!";
	    // char[]	charArray=s.toCharArray();
	     String reverse=reverserString(s);
	     System.out.println(reverse);
		
	}
	
	public static String reverserString(String str) {
		char[]	charArray = str.toCharArray();
		
		int left=0;
		int right = charArray.length-1;
		while(left<right) {
			char temp =charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			
			right--;
			left++;
			
		}
		
		return new String(charArray);
		
	}
	
	}



