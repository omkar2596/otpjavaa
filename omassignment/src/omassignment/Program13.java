//13.Java program to create a reverse order view of the elements contained in a given tree set

package omassignment;

import java.util.TreeSet;
import java.util.Iterator;
  public class Program13 {
  public static void main(String[] args) {
     TreeSet<String> set = new TreeSet<String>();
   
          set.add("Red");
          set.add("Green");
          set.add("Black");
          set.add("Pink");
          set.add("orange");
     // print original list
   System.out.println("Original tree set:" + set);
   
     Iterator it = set.descendingIterator();//reverse//iterator use kelamuley apn tey while lopp ,,dey use kru shkto
     
     System.out.println("Elements in Reverse Order");
     while (it.hasNext()) {
        System.out.println(it.next());
     }
  }
}
