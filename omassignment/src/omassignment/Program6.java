//6. Java program to search an element in a array list

package omassignment;

import java.util.*;
public class Program6 {
public static void main(String[] args) {

List<String> listStrings = new ArrayList<String>();
listStrings.add("Red");
listStrings.add("Green");
listStrings.add("Orange");
listStrings.add("White");
listStrings.add("Black");

  if (listStrings.contains("Red")) {
  System.out.println("Found the element colour");
  } else {
  System.out.println("There is no such element");
  }
}
}
