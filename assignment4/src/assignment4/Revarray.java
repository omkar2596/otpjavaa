package assignment4;

public class Revarray {

	public static void main(String[] args) {
	
		int arr[]= {1,6,-5,0,-3,0,1,9,17,-10};
		reverse(arr, arr.length);
	    }
	
	 private static void reverse(int a[],int n)
	        {	
			int[] b = new int[n]; 
	        int j = n; 
	        for (int i = 0; i < n; i++) { 
	            b[j - 1] = a[i]; 
	            j = j - 1; 
	        }  
	             System.out.println("Reversed array is= \n"); 
		            for (int k = 0; k < n; k++) { 
		               System.out.println(b[k]); 
		        } 
		    
		    }
       }