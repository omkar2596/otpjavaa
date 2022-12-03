package assignment4;

import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		int arr[]=new int[15];
		Random random=new Random();
		
	for(int i=0;i<arr.length;i++){
       arr[i]=random.nextInt(21)-10;
	}
	displayOdd(arr);
	}
	
	 private static void displayOdd(int arr[])
	 {	
		for(int i=1; i<arr.length;i+=2) 
		{
		System.out.println("arr["+i+"]"+arr[i]);
		
		}
		
	  }
	}
