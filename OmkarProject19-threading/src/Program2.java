

public class Program2 {

	public static void main(String[] args) {
		increment();//increment call 100 time then
		decrement();//decrement call 100 time then
		            ////MAIN infinite loop
		
		while(true)
			System.out.println("Main");

	}
	static void increment()
	{
		for(int iTmp=0; iTmp<100;iTmp++ )
			System.out.println("increment");
	}
	static void decrement()
	{
		for(int iTmp=0; iTmp<100;iTmp++ )
		System.out.println("decrement");
	}

}
