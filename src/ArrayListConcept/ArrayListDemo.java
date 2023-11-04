package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add(100);
		al.add(-1);
		al.add("mahant");
		al.add("Madiwal");
		
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.contains("Madiwal"));
		System.out.println(al.size());
		System.out.println(" HI " + (al.size()-1));

	}

}
