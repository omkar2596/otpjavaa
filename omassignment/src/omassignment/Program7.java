//7.Java program to sort a given array list

package omassignment;

import java.util.*;

class Program7 {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("o");
        list.add("m");
        list.add("k");
        list.add("a");
        list.add("r");
        list.add("a");
 
 
        System.out.println("Before Sorting : " + list); //unsorted ArrayList
 
        Collections.sort(list);// Sorting ArrayList in ascending
 
        System.out.println("After Sorting : " + list);//sorted arrey list ahe
    }
}