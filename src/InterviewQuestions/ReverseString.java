package InterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Java Selenium";
//        
//        char[] ch = input.toCharArray();
//        
//        int left=0;
//        int right=input.length()-1;
//        
//        while (left<right) {
//        	char temp=ch[left];
//        	ch[left]=ch[right];
//        	ch[right]=temp;
//        	//move the pointers towards each other 
//        	
//        	left++;
//        	right--;
//        }
//        
//       System.out.println(ch); 
    	
        // WAJP to get mentioned output i/p: "Java Selenium"; o/p: "avaJ muineleS"
        
    	 
//    		    String words[]=input.split("\\s");  
//    		    String reverseWord="";  
//    		    for(String w:words){  
//    		        StringBuilder sb=new StringBuilder(w);  
//    		        sb.reverse();  
//    		        reverseWord+=sb.toString()+" ";  
//    		    }  
//    		    
//    		    System.out.println(reverseWord);
    		    
    		    
    		    //
    		    
    		    System.setProperty("wedriver.chrome.driver", "./driver/chromedriver.exe");
    		    WebDriver driver = new ChromeDriver();
    		    
    		    driver.get("https://www.google.com");
    		    driver.switchTo().activeElement().sendKeys("");
    		     
    		
    		}  
       
    }

 

