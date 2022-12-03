

public class Program {

	public static void main(String[] args) {
		
		Employe [] arrEmploye = new Employe[100];
		int count=0;
		
		int choice = 1;
		 
		while(choice!=9)
		{
			System.out.println("Enter choice");
			choice=ConsoleInput.getInteger();
			switch(choice)
			{
			case 1:
			{
				System.out.println("enter name");
				String name = ConsoleInput.getString();
				
				System.out.println("enter address");
				String address = ConsoleInput.getString();
				
				System.out.println("Enter age");
				int age = ConsoleInput.getInteger();
				
				System.out.println("Enter hra");
				int hra = ConsoleInput.getInteger();
				
				
				arrEmploye[count++] =new Manager(name,address,age,true,1.1f,hra); //upcasting
				//LHS-BASE TYPE**********RHS-DERIVED TYPE......IS CALLED UPCASTING
				//manager ka obj hey lekin eemploye referance stored kr raha hey
			}
			break;
			
			case 2:
			{
				System.out.println("enter name");
				String name = ConsoleInput.getString();
				
				System.out.println("enter address");
				String address = ConsoleInput.getString();
				
				System.out.println("Enter age");
				int age = ConsoleInput.getInteger();
				
				System.out.println("Enter hra");
				int hra = ConsoleInput.getInteger();
				
				arrEmploye[count++] =new Engineer(name,address,age,true,1.1f,hra); //upcasting
				//LHS-BASE TYPE**********RHS-DERIVED TYPE......IS CALLED UPCASTING
				//engineer ka obj hey lekin eemploye referance stored kr raha hey
			}
		  
			case 3:
			{
				Manager objManager = (Manager) arrEmploye[0];//downcasting
				objManager.getHra();
				/*
				Employe emp =arrEmploye[0];
				Manager objManager = (Manager)emp;
				objManager.getHra();
				*/
				{
					System.out.println(objManager.getName());
					System.out.println(objManager.getAddress());
					System.out.println(objManager.getAge());
					System.out.println(objManager.getHra());
					System.out.println("******************");
				}
			}
			break;
			
			
			
			}
		}

	}

}
