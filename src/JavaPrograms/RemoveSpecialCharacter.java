package JavaPrograms;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		
		String inputString = "MahantMadiwal@&&&&!!!!";
		String cleanString=removeSpecialCharacters(inputString);
		
		System.out.println("InputString " +inputString);
		System.out.println("String without special characters " +cleanString);
		// TODO Auto-generated method stub

		
		
	}
	
	public static String removeSpecialCharacters(String input) {
		String s =input.replaceAll("[^a-zA-Z0-9]", "");
		return s; 
	}

}
