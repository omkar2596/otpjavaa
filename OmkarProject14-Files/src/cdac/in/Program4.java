package cdac.in;

import java.io.File;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) {  
		
		
		File objFile = new File("F:\\New folder");//Folder mdely 'image 'bgaych asel tr
		
		String [] fileNames = objFile.list();//folder key adher jo file hey unko check karta hey
		
		for(String name : fileNames)
			System.out.println(name);
	    }
		
		
		private static void basicFile() {
	     try {
	        	File objFile1 = new File("f:\\new folder\\first.txt");//jey apn locaton use krnar titey folder creat or delete kru shkto
	    		//objFile.createNewFile();                            //file creat nahi zali ki ;catch'houn expection run honar
	    		objFile1.delete();	    		
	    		System.out.println("file deleted");
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	

	}

}
	}
