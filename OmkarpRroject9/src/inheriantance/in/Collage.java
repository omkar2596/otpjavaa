package inheriantance.in;
import java.util.*;


public class Collage extends ElectronicDepartment{

	public static void main(String[] args) {
		
		 
		int choice;
	System.out.println("*************Welcome Digital College Platform*************");
	System.out.println("             Select Various Departments");
	System.out.println("Enter your choice in no Form");
	System.out.println("1)Electronic");
	System.out.println("2)Computer science");
	System.out.println("3)Civil");
	Scanner sc = new Scanner(System.in);
	choice = sc.nextInt();
	
    switch(choice)
    {
    case 1:
    {
    	System.out.println("Welcome Electronic Departments");
    	
    	Collage collage = new Collage();
		collage.choosesubject();
    }
    break;
    case 2:
    {
    	System.out.println("Welcome Computer");
    	Collage collage = new Collage();
    	collage.choosesubjectc();
    }
    break;
    case 3:
    {
    	System.out.println("Welcome Civil");
    	Collage collage = new Collage();
    	collage.choosesubjectcc();
    }
    break;
     default:
    {
    	System.out.println("Enter correct no!");
    }
    }
	}

}
