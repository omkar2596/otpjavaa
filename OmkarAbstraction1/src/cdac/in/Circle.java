package cdac.in;

public abstract class Circle implements Shape { //circle la abstract lihley bez shpae mdla property ekch use keli ahe mhnun declear kravey lagley.
	public void draw() {
		System.out.println("draw circle");
	}
}

class displayCircle extends Circle{
	public void display() {
		System.out.println("x: "+x);
	}
	public void colour() {
		System.out.println("colour is red");
	}
}