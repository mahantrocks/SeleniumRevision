package JavaPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Convert_List_toSet {

	public static void main(String[] args) {
		
		String[] stringArray = {"Mahant","Mahant","Madiwal","Sadalga"};
		Set<String> setArray = new HashSet<>(Arrays.asList(stringArray));
		
		System.out.println(stringArray);
		System.out.println(setArray);
		// TODO Auto-generated method stub

	}

}
