//'program 2' ha write karto information selected location la
//'demo.txt ha folder creat zala ahe to apn exact read karu shkat nahi jashi apn information pass keli ahe mhnun but ti information exact read krnasti program 3 ha demo.txt file use karun exact info read karu shkto'
//only select path any and put any infomation see line no 14 15 16 and automatic file created as per our logic.
//but ek problem ahe ha data creat zalavr ahe tsa disat nahi ...'tey disnasti apn next exp bgnar "program3 mdey" '
import java.io.*;//program 3 creat bez 'program 2'op clear disat nahi mhnun program 3 mdey clear disnar.
//line 12 folder creat karto but data exact read karta yet nahi mhnun 'program 3'mdey to data read karta yeto ahe tsa

public class Program2 {

	public static void main(String[] args) {
		
		DataOutputStream dataOutputStream =null;
		 FileOutputStream fileOutputStream = null;//file ko'write'krney key liye
	   try {  
		 fileOutputStream = new FileOutputStream("F:\\New folder\\demo.txt");//any location you want& folder creat karto
		dataOutputStream = new DataOutputStream(fileOutputStream);//data jo convert ho jayega usko hum 'fileoutputstream 'mey rakegey		 
	   
		dataOutputStream.writeUTF("john");//this path la hey data save hoto
		dataOutputStream.writeInt(55);
		dataOutputStream.writeFloat(77.4f);
		
		System.out.println("file written");
	}
	   catch (FileNotFoundException e)//auto generate catch block
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
        finally
        {
        	try
        	{
        		if(dataOutputStream!=null)
        			dataOutputStream.close();
        			
        	    if(fileOutputStream!=null)
        				fileOutputStream.close();	
        	}
        	catch (IOException e)
        	{
        	e.printStackTrace();	
        	}
        }
}
}