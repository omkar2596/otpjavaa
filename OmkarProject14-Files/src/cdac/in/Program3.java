package cdac.in;

import java.io.File;
import java.io.IOException;

public class Program3 {//delete folder exmp

	public static void main(String[] args) {
	
	     try {
	        	File objFile = new File("f:\\new folder\\first.txt");//jey apn locaton use krnar titey folder creat or delete kru shkto
	    		//objFile.createNewFile();                            //file creat nahi zali ki ;catch'houn expection run honar
	    		objFile.delete();	    		
	    		System.out.println("file deleted");
	        }
	        catch(Exception e)
	         {
	        	e.printStackTrace();
	         }

	}
	}
