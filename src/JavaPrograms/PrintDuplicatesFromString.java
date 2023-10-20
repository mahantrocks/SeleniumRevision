package JavaPrograms;

public class PrintDuplicatesFromString {

	public static void main(String[] args) {
		String s = "TestingAutomation";
		char[] ch=s.toCharArray();
		
		int count=0;
		
		for (int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Dupliacate character in String is :" +ch[j]);
					count++;
				}
			}
		}
		System.out.println("Total number of duplicate count is : "+count);
	}

}
