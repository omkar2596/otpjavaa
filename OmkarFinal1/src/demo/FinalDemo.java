package demo;

public class FinalDemo {
	//final String name  = "hello";//final varable hence declear the value cant chage
	final int x = 10;
	final int y = 15;
	final int z =1;
	
//	public FinalDemo() {
//		name = "omkar";
//	}
	final void add(){
	int	z = x+y;
	System.out.println(+z+y+x);
	}
	void sub(){
		int	z = x+y;
		System.out.println(+z+y+x);
		}
	
	class calc extends FinalDemo{
		void sub() {
			int z =10-8;
		}
	}

	
}
