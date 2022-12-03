

public class Program2Example {

	public static void main(String[] args) {
	
		System.out.println("Enter your age");
		int age = ConsoleInput.getInteger();
		
		
        System.out.println("statement no 1 = main");
        
        try//only try excuate
        {
        	System.out.println("statement no 2= try");
        	if(age < 18 || age > 60) //range brobr asel tr 'statement no 3=try'print honar
        		throw new Exception("Invalied age entered");//throw use brobr asel tr next print hoto but wrong asel value tr 'catch mdey run karto'
        		
        	System.out.println("statement no 3=try");
        	
        }
        catch(Exception npe) //catch mdey janar nahi bez 'str ' mdey value ahe
        {
        	System.out.println("Statement no 4 - catch-"+ npe);
        	
        }
        System.out.println("statement no 5=main");
	}

}
