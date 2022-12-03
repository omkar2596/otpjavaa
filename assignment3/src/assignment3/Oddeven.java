package assignment3;

public class Oddeven {

	public static void main(String[] args) {
	int n=1254030;
	int even=0;
	int odd=0;
	int num=n;
	
	while(num>0)
	{
	int count=num%10;
	num=num/10;
	if(num%2==0)
		even+=count;
	else 
		odd+=count;
	}
	System.out.println(" sum of even digits = "+even);
	System.out.println(" sum of even digits = "+odd);
	}
}
