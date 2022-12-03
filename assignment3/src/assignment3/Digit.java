package assignment3;

public class Digit {

	public static void main(String[] args) {
		int count=0;
		int num=129010;
		
		
		while(num>0) {			
		 num/=10;
		 count++; 		
		}
		System.out.println(129010+ " has " +count+ " digit");
	}

}
