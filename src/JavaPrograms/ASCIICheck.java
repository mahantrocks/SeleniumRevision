package JavaPrograms;
public class ASCIICheck {
    public static void main(String[] args) {
    	String ascii="Mahant";
    	char[] charArray=ascii.toCharArray();
    	for(int i=0;i<charArray.length;i++) {
    		int asci =(int) ascii.charAt(i);
    		System.out.println(" ASCII value of ' "+charArray[i] + " ' is " + asci);
    		
    	}
       // char character = 'A'; // Change this to the character you want to check

    }
}
