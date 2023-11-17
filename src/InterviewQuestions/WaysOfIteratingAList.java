package InterviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class WaysOfIteratingAList {
	

	public static void main(String[] args) {
		
	List<String> nickNames= new ArrayList<String>();
	nickNames.add("Subbi");
	nickNames.add("dubbi");
	nickNames.add("Gullavva");
	nickNames.add("Shonapari");
	nickNames.add("MaajiDubbi");
	
	// Using lamda expression on or above Java 8
	System.out.println("---Print using lamda expression ");
	nickNames.forEach( name -> {System.out.println(name);});
	
	
	// Using iterator 
	System.out.println("---Print using Iterator method ");
	Iterator<String> it = nickNames.iterator();
	while(it.hasNext()) {
		String s =it.next();
		System.out.println(s);
	}
	
	// Using for loop
	
	System.out.println("---Print using for each loop method ");
		for (String name:nickNames) {
		System.out.println(name);
	}
		
		
		// Using for loop with index
		System.out.println("Print using for loop with index");
		for (int i=0;i<nickNames.size();i++) {
			String nm =nickNames.get(i);
			System.out.println(nm);
		}
		
		//Using ListerIterator 
		System.out.println("Print using List Iterator ");
		ListIterator<String> li=nickNames.listIterator();
		while (li.hasPrevious()) {
			String l=li.previous();
			System.out.println(l);
		}
		
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
