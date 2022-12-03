//(DECRYPTED  FILE CONVERT INTO ENCRYPTED FILE PROGRAM )

import java.io.*;
import java.io.FileInputStream;        
import java.io.FileNotFoundException;      //step 1-ha 'program-1' 'encrypted zaleli file dycrypted karto ani jey location dieley ahe titey save karto 
import java.io.FileOutputStream;           //step 2-"F:\\New folder\\first2.enc"
//step 3-"F:\\New folder\\first3.txt"...'text 3' 'seperate kela folder tr seperate disnar output nahitr 'text 2' 'tevley tr tyatch enc creat honar' '
public class Program1 {

	public static void main(String[] args)    
	{
	     FileInputStream fileInputStream = null; //file ko read karney key liye
	     FileOutputStream fileOutputStream = null;//file ko'write'krney key liye
	     
	     try {
	     File objFile = new File("F:\\New folder\\ECRYPTED FILE.enc");//'content' read karney key liye
	     
	     fileInputStream = new FileInputStream(objFile); //objFile mey path hey '14'ley pey path hey "F:\\New folder\\first1.txt"yesa bhi direct kr sktey hey kuch problem nahi
	     fileOutputStream = new FileOutputStream("F:\\New folder\\DECRYPTED FILE1.txt");//data write karney key liye creat kiya hey
	     
	     byte [] data = new byte[(int)objFile.length()]; //jo bhi file ka size rahega utna byte[] rahega
	     
	     fileInputStream.read(data); //data byte are key form mey mila
	     //dncrypted kelaa
	     byte [] decData = new byte[data.length]; //new arrey created & data encrepted karney key liye
	     
	     for(int iTmp=0; iTmp<data.length;iTmp++)
	     
	    	 //data[iTmp]-=15;
	    	 decData[iTmp] = (byte)(data[iTmp] - 15);//minius kelamuley dycrypted zala
	     
	     fileOutputStream.write(decData);
	     System.out.println("file decrypted");
	     
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
		try {
		if(fileInputStream!=null)
			fileInputStream.close();
		
		if(fileOutputStream!=null)
			fileOutputStream.close();
		}
	catch (IOException e)
	{
		e.printStackTrace();//auto generate catch block
	}

}
 }
	}