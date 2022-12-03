
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
				

				System.out.println("enter basic salary");
				float  basicSalary= ConsoleInput.getFloat();
				
				System.out.println("Enter hra");
				int hra = ConsoleInput.getInteger();
				
				
				arrEmploye[count++] =new Manager(name,address,age,true,basicSalary,hra);
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
				
				System.out.println("enter basic salary");
				float  basicSalary= ConsoleInput.getFloat();
				
				System.out.println("Enter over time");
				int overTime = ConsoleInput.getInteger();
				
				arrEmploye[count++] =new Engineer(name,address,age,true,basicSalary,overTime); //upcasting
				//LHS-BASE TYPE**********RHS-DERIVED TYPE......IS CALLED UPCASTING
				//engineer ka obj hey lekin eemploye referance stored kr raha hey
			}
		  
			case 4:
			{
				for(Employe objEmploye : arrEmploye)
				{
					if(objEmploye == null)//null asel tr value print nahi honar
						break;
					System.out.println("Name "+objEmploye.getName());
					System.out.println("Address "+objEmploye.getAddress());
					System.out.println("Age "+objEmploye.getAge());
					System.out.println("basic salary "+objEmploye.getBasicSalary());
					System.out.println("Total salary "+objEmploye.computeSalary());
					System.out.println("******************");
				}
			}
			break;
			
			
			
			}
		}

	}

}
