

public class Program1 {

	public static void main(String[] args) {
		increment();//increment call 100 time then
		decrement();//decrement call infinite loop
		
		//while(true)
			//System.out.println("Main");

	}
	static void increment()
	{
		for(int iTmp=0; iTmp<100;iTmp++ )
			System.out.println("increment");
	}
	static void decrement()
	{
	//	while(true)
			for(int iTmp=0; iTmp<100;iTmp++ )
		System.out.println("decrement");
	}

}
