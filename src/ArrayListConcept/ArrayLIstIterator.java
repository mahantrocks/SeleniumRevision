package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIstIterator {

	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>(); 
		al.add("Subbbi");
		al.add("Gullavva");
		al.add("Shonapali");
		al.add("Pari");
		al.add("Maaji Dubbi");
		al.add("Kashi");
		al.add("Chandipuri");
		al.add("Bangari");
		al.add("Naomi");
		
		for (int i=al.size()-1;i>=0;i--) {
			
			//System.out.println(al.get(i));
			
		}
		
		System.out.println("***************************Shonapali Names in Order*******************************");
		for (String nickName:al) {
			System.out.println(nickName);
		}
		
		System.out.println("***************************Names with Lamda Expression*******************************");
		
		al.stream().forEach(name ->System.out.println(name));
		
		System.out.println("***************************Names2 with Lamda Expression*******************************");
		
		al.stream().forEach(name2 -> System.out.println(name2));
		
		//Print the values with Iterator
		System.out.println("********************");
		Iterator<String>it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
