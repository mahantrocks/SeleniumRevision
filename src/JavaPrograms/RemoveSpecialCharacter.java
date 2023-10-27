package JavaPrograms;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		
		String inputString = "MahantMadiwal@&&&&!!!!";
		String stringWithoutSpecialCharacter=removeSpecialCharacters(inputString);
		
		System.out.println("InputString " +inputString);
		System.out.println("String without special characters " +stringWithoutSpecialCharacter);
		// TODO Auto-generated method stub

		
		
	}
	
	public static String removeSpecialCharacters(String input) {
		String s =input.replaceAll("[^a-zA-Z0-9]", "");
		return s; 
	}

}
