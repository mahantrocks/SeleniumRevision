package JavaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class addTwoArraysAnd_removeDuplicateValues {
	
	public static void main(String[] args) {
		
	List<String>a1= new ArrayList<String>();
	a1.add("mahant");
	a1.add("mahan");
    a1.add("madiwal");
    a1.add("mahadev");
    
    List<String>a2= new ArrayList<String>();
	a2.add("matashree");
	a2.add("mahadev");
    a2.add("madiwal");
    
    a2.addAll(a1);
    
    System.out.println(a2);
    
    
    // Add  all the values in set which can only store the unique values 
    Set<String> uniquesNames = new HashSet<String>(a2);
    
    System.out.println("Store Unique values : " + uniquesNames);
    
    
    
    
    
    
//   HashMap<Integer, String> map = new HashMap<Integer,String>();
//   
//   for (int i=0;i<a2.size();i++) {
//	   
//   if (!map.containsValue(a2.get(i))) {
//	 map.put(i, a2.get(i));
//   }
//   else {
//	   System.out.println(" Duplicate values are ' "+a2.get(i));
//	   
//   } 
//	   
//	   
//   }
//   System.out.println((map));
    	
    }
	

}

