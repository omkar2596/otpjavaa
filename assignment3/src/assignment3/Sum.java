package assignment3;

public class Sum {

	public static void main(String[] args) {
	int a=12;
	int d=-2;
	int n=5;
	int sum=0;
	int count=0;
	int i;
	
	for(i=1;i<n;i++) {
		sum=a+(i-1)*d;
		System.out.print(sum + "+");
		count +=sum;}
	sum=a+(i-1)*d;
	count+=sum;
	System.out.print(sum + "="+count);
	}
}
