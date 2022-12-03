package assignment2;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
		int percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the percentage");
		percentage=sc.nextInt();
        
        if(percentage>=75)
         {
        	System.out.println("grade A");
         }
            else if(percentage>=60)
        	    System.out.println("grade B");
         	
        	   else if(percentage>=40)
        		   System.out.println("grade C");
        
        	   else 
        		   System.out.println("failed");
	     }		

	}

