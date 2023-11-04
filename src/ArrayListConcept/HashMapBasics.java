package ArrayListConcept;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapBasics {

	public static void main(String[] args) {
		
		HashMap<String, String> basics = new HashMap<String, String>();
		basics.put("Shon", "Pali");
		basics.put(null, "Pali");
		basics.put(null, "Dubbi");
		basics.put("Maaji", null);
		basics.put("Tuji", null);
		basics.put("subbi", "Dubbi");
		
		System.out.println(basics.get(null));
		System.out.println(basics.get("Shon"));
		System.out.println(basics.get("Maaji"));
		System.out.println(basics.get("Tuji"));
		System.out.println(basics.get("subbi"));
		
//		Iterator<String> it=basics.keySet().iterator();
//		while(it.hasNext()) {
//			String key=it.next();
//			String value=basics.get(key);
//			System.out.println(" Key = " + key +" Value = " + value);
//		}
		
		Iterator<String> keys=basics.keySet().iterator();
		
		while(keys.hasNext()) {
			String key=keys.next();
			String value=basics.get(key);
			System.out.println(" Key = " + key + " value = "+value);
		}
//		
		
		// TODO Auto-generated method stub

	}

}
