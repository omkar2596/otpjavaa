//3. Java program to retrieve an element (at a specified index) from a given array list.
package omassignment;

import java.util.*;
public class Program3 {
public static void main(String[] args) {

List<String> list_Strings = new ArrayList<String>();
list_Strings.add("Red");
list_Strings.add("Green");
list_Strings.add("Orange");
list_Strings.add("White");
list_Strings.add("Black");

System.out.println(list_Strings);

String element = list_Strings.get(2);
System.out.println("Third element: "+element);
element = list_Strings.get(1);
System.out.println("second element: "+element);
}
}
