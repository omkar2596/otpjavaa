
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = null;//null example
        System.out.println("statement no 1 = main");
        
        try
        {
        	System.err.println("statement no 2= try");
        	str.charAt(1);//not null so shift on 'catch'
        	System.out.println("statement no 3=try");
        	
        }
        catch(NullPointerException npe) //error check krnasti npe throgh bgitley
        {
        	System.out.println("Statement no 4 - catch-"+ npe);
        	
        }
        System.out.println("statement no 5=main");
	}

}
