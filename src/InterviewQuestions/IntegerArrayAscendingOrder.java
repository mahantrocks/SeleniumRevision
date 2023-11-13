package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class IntegerArrayAscendingOrder {

	public static void main(String[] args) {
		
		
		
		// Sort the given Array in Ascending order with Inbuild Method
		
		Integer[] Array = {89,109,49,90,5,10001,20001};
		
		int temp;
		
		for (int i=0;i<Array.length;i++) {
			
			for (int j=0;j<Array.length;j++) {
				
				if(Array[i]>Array[j]) {
					temp=Array[i];
					Array[i]=Array[j];
					Array[j]=temp;
				}
			}
		}
		
		for (int N :Array) {
			System.out.println(N);
		}
		
		System.out.println("*******************************************************************************************");
		
		// Sort the given array in Ascending order with Inbuilt Method
		
		Integer[] Array1 = {89,109,49,90,5};
		Collections.sort(Arrays.asList(Array1));
		
		for (int N1 :Array1) {
			System.out.println(N1);
		}
		//System.out.println(Array1.toString());
		
		

	}

}
