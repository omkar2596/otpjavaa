package cdac.in;

import java.io.File;

public class Program5 {//folder creat

	public static void main(String[] args) {

	     try {
	        	File objFile = new File("f:\\new folder\\first\\creat\\multiple\\folder\\m");//jey apn locaton use krnar titey folder creat or delete kru shkto
	    		//objFile.createNewFile();                            //file creat nahi zali ki ;catch'houn expection run honar
	    		objFile.mkdirs();	  //'mkdir' use only one folder creat & 'mkdirs'use multuple folder creat  		
	    		System.out.println("folder creat");
	        }
	        catch(Exception e)
	         {
	        	e.printStackTrace();
	         }

	}

}
