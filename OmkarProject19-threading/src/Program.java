
public class Program {

	public static void main(String[] args) {
		//synchronous call ....atapyat synchronous methode use keli ahe
		increment();//increment call infinite loop
		decrement();
		
		while(true)
			System.out.println("Main");

	}
	static void increment()
	{
		while(true)
			System.out.println("increment");
	}
	static void decrement()
	{
		System.out.println("decrement");
	}

}
