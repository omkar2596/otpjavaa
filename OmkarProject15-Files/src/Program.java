import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {//any data type karun pahjey tya location la stored karta yetey.

	public static void main(String[] args) {
      
		try 
		{
			FileOutputStream fileOutputStrem = new FileOutputStream("f:\\New folder\\first.txt");//location...'location wrong asel exception honar and catch honar'
			
					String data ="Welcome to yhr file application,this is the first created....";
					
		        	fileOutputStrem.write(data.getBytes());
		        	System.out.println("file write");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
