package JavaPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Convert_List_toSet {

	public static void main(String[] args) {
		
		String[] stringArray = {"Mahant","Mahant","Madiwal","Sadalga"};
		List<String> list=Arrays.asList(stringArray);
		
		
		System.out.println(Arrays.asList(stringArray));
		
		Set<String> setArray = new HashSet<>(list);
		
		//trying to add duplicate elements in set
		setArray.add("Mahant");
		
//		System.out.println(stringArray);
		System.out.println(setArray);
//		// TODO Auto-generated method stub

	}

}
