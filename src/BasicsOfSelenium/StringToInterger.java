package BasicsOfSelenium;

public class StringToInterger {

	public static void main(String[] args) {
		
		String number = "2";
		
		int n=Integer.parseInt(number);
		System.out.println(n+" : Is a converted number from Sting");
		// TODO Auto-generated method stub
		
		int i=5;
		int j=10;
		
		i=i+j; //15
		j=i-j; //5
		i=i-j; //15-5 // 10
		
		System.out.println("Value of i after Swipping : "+i+" Value of J after Swiping : "+j);
		
		
		String s = "Mahant";
		
		char[] chr=s.toCharArray();
		
		System.out.println(chr);
		
		
		

	}

}
