package JavaPrograms;

public class RemoveNumbers {

	public static void main(String[] args) {
		
		String name = "Mahant12t67t3246";
		char[] ch=name.toCharArray();
		// TODO Auto-generated method stub
 StringBuffer sb = new StringBuffer();
// String removenumbers=name.replaceAll("\\d", "");
// System.out.println("String after removal of number :"+removenumbers);
 
 for (int i =0;i<ch.length;i++) {
	 if (!Character.isDigit(ch[i])) {
		 sb.append(ch[i]);
	 }
 }
 
 System.out.println(sb);
	}

}
