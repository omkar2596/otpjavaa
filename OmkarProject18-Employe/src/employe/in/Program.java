package employe.in;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = null;
		try {
		scanner = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name = scanner.next();
		
		System.out.println("Enter address");
		String address = scanner.next();
		
		System.out.println("enter age");
		int age =  scanner.nextInt();
		
		System.out.println("enter the gender");
		String strGender
		boolean gender = scanner.nextBoolean();
		
		System.out.println("enter salary");
		float salary = scanner.nextFloat();
		
		System.out.println("enter the hra");
		float hra = scanner.nextFloat();
		
		Manager objManager = new Manager(name,address,age,gender,salary,hra);

		System.out.println(objManager.getName());
		System.out.println(objManager.getAddress());
		System.out.println(objManager.getAge());
		//System.out.println(objManager.isGender());//op true or false
		
		if(objManager.isGender())
		System.out.println("male");
		else
			System.out.println("female");//is bez getter setter mdey is ahe mhnun
		
		System.out.println(objManager.getBasicSalary());
		System.out.println(objManager.getHra());
		
		
	}finally {
		scanner.close();
	}
	
		
		
		
	}

}
