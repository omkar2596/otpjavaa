//14.Java program to get the first and last elements in a tree set.  
package omassignment;

import java.util.TreeSet;
 public class Program14 {
 public static void main(String[] args) {
 TreeSet<String> treeset = new TreeSet<String>();
 treeset.add("Red");
 treeset.add("Green");
 treeset.add("Orange");
 treeset.add("White");
 treeset.add("Black");
 System.out.println("Tree set: ");
 System.out.println(treeset);

   Object first_element = treeset.first();
   System.out.println("First Element is: "+first_element);

   Object last_element = treeset.last();
   System.out.println("Last Element is: "+last_element);
}
}