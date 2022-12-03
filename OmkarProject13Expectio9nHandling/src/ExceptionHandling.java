import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
	 try {
		 senndSMS("123456","omi");
	 }
	 catch (Exception e){
		 e.printStackTrace();
	 }
	}
	static void senndSMS(String mobile,String text) throws Exception
	{
		boolean connection = false;
		boolean sms = false;
		System.out.println("connect to mobile tower");
		
		connection = true;//true condition check
		
		if(connection==true)
		    System.out.println("connecting to mobile tower");
		else
			throw new Exception("failed connection");
		
		System.out.println("sending SMS");
		sms = true;
		if(sms ==true)
			System.out.println("sms sent");
		else
			throw new Exception("failed sending sms");
		
	
	}
}