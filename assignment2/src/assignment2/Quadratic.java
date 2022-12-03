package assignment2;

public class Quadratic {

	public static void main(String[] args) {
		
		  double root1,root2;
	      double a=6;
	      double b=0;
	      double c=-24;

	      double determinant = (b*b)-(4*a*c);
	      double sqrt = Math.sqrt(determinant);

	      root1 = (-b + sqrt)/(2*a);
	      root2 = (-b - sqrt)/(2*a);
	      System.out.println("X has two different real solutions. X= " +root1+ " or " +root2);
 
        }
    }