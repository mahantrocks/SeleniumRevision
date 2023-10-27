package JavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertSetIntoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();
		set.add("Subbi");
		set.add("dubbi");
		set.add("Subbi");
		
		System.out.println(set);
		
		List<String> list = new ArrayList<String>(set);
		list.add("Subbi");
		System.out.println(list);

	}

}
