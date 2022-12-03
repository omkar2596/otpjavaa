import java.io.IOException;
import java.sql.SQLException;

public class Program3Example {

	public static void main(String[] args) {
	
		System.out.println("Enter your age");
		int age = ConsoleInput.getInteger();
		
		boolean flag = false;//false op check...'if' condition not check
        System.out.println("statement no 1 = main");
        
        //only try excuate
       try {
        	System.out.println("statement no 2= try");
        	if(age < 18 || age > 60) //range brobr asel tr 'statement no 3=try'print honar
        		throw new IOException("Invalied age entered");//throw use brobr asel tr next print hoto but wrong asel value tr 'catch mdey run karto'
        		
        	System.out.println("statement no 3=try");
        	if(flag)  //condition 'false 'aslmulry if mdla condition run nahi honar
        		throw new SQLException("Invalied data entered");
        	System.out.println("statement no 4=try");
        }
        catch(SQLException sql)
         {
        	System.out.println("statement no 5 -(a)catch - "+sql);
         }
        catch(IOException io) //catch mdey janar nahi bez 'str ' mdey value ahe
        {
        	System.out.println("Statement no 5 - catch - "+ io);
        	
        }
        System.out.println("statement no 6=main");
	}

}
