package cdac.in;

public class Program {

	public static void main(String[] args) {
		displayCircle dc = new displayCircle();
		dc.draw();
		dc.display();
		dc.colour();

		System.out.println("x "+Shape.x);
		
		Rectangle rect = new Rectangle();
		rect.display();
		rect.draw();
		rect.colour();
		
		Rectangle rect1 = new Rectangle();
		rect1.colour();
		Rectangle rect2 = new Rectangle();
		rect1.colour();
		
	}

}
