package JavaPrograms;

public class VerifyOwelsAndConstants {

	public static void main(String[] args) {
		
		String s = "Hello World!";
		
		int owels =0;
		int constants=0;
		
		String l=s.toLowerCase();
		
		for (int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if (ch>='a'&& ch<='z') {
				if(ch == 'a'|| ch=='e' || ch=='i'|| ch=='o' || ch=='u') {
					owels++;
				}
				else {
					constants++;
				}
			}
		}
		System.out.println(owels);
		System.out.println(constants);
		
		// TODO Auto-generated method stub

	}

}
