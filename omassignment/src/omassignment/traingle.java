package omassignment;

import java.util.Scanner;

public class traingle {
	public static void main(String args[]) 
    {   
       
      Scanner sc= new Scanner(System.in);
      double s1, s2, s3;
        //Taking the user input
        System.out.println("Enter the first side:");
        s1= sc.nextDouble();
        System.out.println("Enter the second side:");
        s2= sc.nextDouble();
        System.out.println("Enter the third side:");
        s3= sc.nextDouble();
        
        if((s1+s2)>s3 && (s1+s3)>s2 && (s2+s3)>s1) //Checking if the triangle with the given sides exist
        {
            double s=(s1+s2+s3)/2; //Finding the semi-perimeter
            double  area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3)); //Using heron's formula to find the area
            System.out.println("Area of Triangle is: " + area);
          }
        else  
           System.out.println("The triangle with entered dimensions does not exist");
   }
}
	 