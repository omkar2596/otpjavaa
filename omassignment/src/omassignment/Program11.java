//11.Java program to create a new tree set, add some colors (string) and print out the tree set

package omassignment;

import java.util.TreeSet;
public class Program11 {
  public static void main(String[] args) {
  TreeSet<String> treeset = new TreeSet<String>();//creat tree set
  treeset.add("Red");
  treeset.add("Green");
  treeset.add("Orange");
  treeset.add("White");
  treeset.add("Black");
  System.out.println("Tree set= ");
  System.out.println(treeset);
 }
}
