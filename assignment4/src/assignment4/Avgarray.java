package assignment4;

public class Avgarray {

	public static void main(String[] args)  {  
         
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        double sum = 0;    
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }    
        double result=sum/arr.length;
       
	getAverage(result);
	}
	
	 public static void getAverage(double result)
	 {	
		 
		 System.out.println("average is "+result);	
		 
	 }
}

