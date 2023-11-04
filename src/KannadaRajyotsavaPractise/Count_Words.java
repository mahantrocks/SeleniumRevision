package KannadaRajyotsavaPractise;

public class Count_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Mahant Is an Automation Engineer";
		int count=0;
		
		for (int i=0;i<s.length();i++) {
			if ((s.charAt(i)==' ')&&(s.charAt(i+1) !=' ')) {
				count++;
			}
		}
		System.out.println(count);

	}

}
