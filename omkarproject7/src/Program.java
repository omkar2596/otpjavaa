
public class Program {

	public static void main(String[] args) {
		Manager [] arrManager = new Manager[100];
		int countManager = 0;
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
				
				arrManager[countManager] =new Manager();
				arrManager[countManager].setName(name);
				arrManager[countManager].setAddress(address);
				arrManager[countManager].setAge(age);
				
				countManager++;
			}
			break;
			
			case 4:
			{
				for(int iTmp=0; iTmp<countManager; iTmp++)
				{
					System.out.println(arrManager[iTmp].getName());
					System.out.println(arrManager[iTmp].getAddress());
					System.out.println(arrManager[iTmp].getAge());
					System.out.println("****************");
				}
			}
			
			break;
			
			/*
			case 4:
			{
				for(Manager objManager : arrManager)
				{
					System.out.println(objManager.getName());
					System.out.println(objManager.getAddress());
					System.out.println(objManager.getAge());
					System.out.println("******************");
				}
			}
			break;
			*/
			case 5:
			{
				String empName = arrManager[0].getName();
				String secName = arrManager[1].getName();
				
				if(empName.compareTo(secName) >0)
				{
					Manager tmpManager = arrManager[1];
					arrManager[1] = arrManager[0];
					arrManager[0] = tmpManager;
				}
				else if(empName.compareTo(secName) < 0);
			}
			break;
			}
		}

	}

}
