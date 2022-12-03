//12.Java program to add all the elements of a specified tree set to another tree set.  

package omassignment;

import java.util.TreeSet;

public class Program12 {
  public static void main(String[] args) {
  TreeSet<String> treeset1 = new TreeSet<String>();
  treeset1.add("Green");
  treeset1.add("Red");
  treeset1.add("Orange");
  System.out.println("Tree set1: "+treeset1);
  TreeSet<String> treeset2 = new TreeSet<String>();
  treeset2.add("Pink");
  treeset2.add("White");
  treeset2.add("ABlack");
  System.out.println("Tree set2: "+treeset2);
 
   treeset1.addAll(treeset2);
   System.out.println("Tree set1: "+treeset1);
 }
}