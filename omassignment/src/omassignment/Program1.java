//1. new array list, add some colors (string) and print out the collection.

package omassignment;

import java.util.ArrayList;
public class Program1 {
    public static void main(String [] args) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Green");
        color.add("Yellow");
        color.add("Black");
        color.add("Red");
        System.out.print(color);
    }
}