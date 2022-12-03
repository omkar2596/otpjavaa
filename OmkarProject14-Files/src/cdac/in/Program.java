package cdac.in;

import java.io.File;

public class Program {

	public static void main(String[] args) {
		
		File objFile = new File("f:\\new folder\\first.txt");
		objFile.createNewFile();//ha 'exception 'remove krnasti 'try' 'catch 'use krava lagto 
		
		System.out.println("file created");

	}

}
