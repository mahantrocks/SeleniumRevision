package ArrayListConcept;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateValueByLinkedHashSet {
	
	public static void main(String[] args) {
		
//		Integer [] array = {1,2,3,4,5,6,7,8,9,1,2,3,4};
//		
//		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(array));
//		
//		System.out.println("Numbers before removing dulicates : " +numbers);
//		
//		LinkedHashSet<Integer> removedDuplicates = new LinkedHashSet<Integer>(numbers);
//		System.out.println("Numbers after  removing dulicates : " +removedDuplicates);
//		
		// How can you remove the duplicates from the array
		
		Integer[] array = {100,200,300,400,100,200,900};
		
		List<Integer> duplicates = new ArrayList<Integer>(Arrays.asList(array));
		System.out.println(" Duplicate numbers : " +duplicates);
		
		Set<Integer> uniqueValue = new HashSet<Integer>(duplicates);
		System.out.println(" Unique Numbers " + uniqueValue);
		
	}

}
