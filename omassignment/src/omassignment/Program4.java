//4. Modify the above Java program to update specific array element by given element.
package omassignment;

import java.util.*;
public class Program4 {
public static void main(String[] args) {
// Creae a list and add some colors to the list
List<String> listStrings = new ArrayList<String>();
listStrings.add("one");
listStrings.add("two");
listStrings.add("three");
listStrings.add("four");
listStrings.add("five");

System.out.println(listStrings);

listStrings.set(1, "four");
 
System.out.println(listStrings);
}
}