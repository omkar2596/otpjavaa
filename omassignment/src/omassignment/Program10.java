//10. reverse 
package omassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program10 {  
    public static void main(String[] args) {  
        List<String> l = new ArrayList<String>();  
        l.add("1");  
        l.add("2");  
        l.add("3");  
        l.add("4");  
        System.out.println("Before reverse");  
        System.out.println(l.toString());  
          
        Collections.reverse(l);  
        System.out.println("After reverse");  
        System.out.println(l);  
    }  
}