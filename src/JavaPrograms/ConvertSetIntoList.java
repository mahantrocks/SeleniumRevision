package JavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertSetIntoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set cannot store mutliple null values
		Set<String> set = new HashSet<String>();
		set.add("Subbi");
		set.add("dubbi");
		set.add("Subbi");
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		//ArrayList can store multiple duplicate and null values
		List<String> list = new ArrayList<String>(set);
		list.add("Subbi");
		list.add(null);
		System.out.println(list);

	}

}
