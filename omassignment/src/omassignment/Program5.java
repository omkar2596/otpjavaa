//5. Java program to remove the third element from a array list.

package omassignment;
import java.util.ArrayList;  

public class Program5{  
	   public static void main(String[] args) {  
	        
	      ArrayList<String> arr = new ArrayList<String>(5);  
	        
	      arr.add("one");  
	      arr.add("two");  
	      arr.add("three");  
	      arr.add("four");  
	      System.out.println("The list of the size is: " + arr.size());  
	      
	      for (String name : arr) {  
	         System.out.println("Name is: " + name);  
	      }    
	        
	      arr.remove(2);  
	      System.out.println("\nremoving the element the size: " + arr.size());  
	       
	      for (String name : arr) {  
	         System.out.println("Name is: " + name);  
	      }  
	   }  
	}  