import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner= null;
		try {
		scanner = new Scanner(System.in);
		
		System.out.println("enter data");
		int data = scanner.nextInt();
		System.out.println("enter name");
        String name = scanner.next();
        
        System.out.println("******************");
        System.out.println(data);
        System.out.println(name);
		}finally {
			if(scanner!=null)
					scanner.close();
		}
	}

}
