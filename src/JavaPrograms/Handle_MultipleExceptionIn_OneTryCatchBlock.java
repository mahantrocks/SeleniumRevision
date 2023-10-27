package JavaPrograms;

public class Handle_MultipleExceptionIn_OneTryCatchBlock {

	public static void main(String[] args) {
		
		try {
			
			int i=10/0;
			String value=null;
		int length=value.length();
		}
	catch(ArithmeticException | NullPointerException ex) {
		System.out.println(ex);
		
	}

	}

}
