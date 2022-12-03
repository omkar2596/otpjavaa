
public class Program1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "hp"; 
        System.out.println("statement no 1 = main");
        
        try//only try excuate
        {
        	System.out.println("statement no 2= try");
        	str.charAt(1);//not null so shift on 'catch'
        	System.out.println("statement no 3=try");
        	
        }
        catch(NullPointerException npe) //catch mdey janar nahi bez 'str ' mdey value ahe
        {
        	System.out.println("Statement no 4 - catch-"+ npe);
        	
        }
        System.out.println("statement no 5=main");
	}

}
