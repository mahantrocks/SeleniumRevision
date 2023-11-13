package InterviewQuestions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortTheStringInDescendingOrder {

	public static void main(String[] args) {
		

		

String input = "Java Selenium Python APITesting Jenkins";

String[] array =input.split(" ");

StringBuilder sb= new StringBuilder();


//This is the code for ascending sorting 

//Arrays.sort(array);



for (int i=array.length-1;i>=0;i--){
sb.append(array[i]).append(" ");

}
for (String a :array) {
System.out.println(a);
}





// This is the logic for Descending words from the given String
Arrays.sort(array, Collections.reverseOrder());

String output = String.join(" ", array);

System.out.println(output);
	
	}
	}

