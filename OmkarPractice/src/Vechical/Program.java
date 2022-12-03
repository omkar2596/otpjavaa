package Vechical;

public class Program {

	public static void main(String[] args) {
		Vechicle [] arrVehicle=new Vechicle[2]; 
		 
		 arrVehicle[0] = new Car(2000,1,4,1,6); 
		 arrVehicle[1] = new Bike(250,1,2,1); 
		 
		 Car secCar = (Car)arrVehicle[0]; 
		 System.out.println(arrVehicle[0]); 
		 System.out.println(arrVehicle[1]); 
		 
		 System.out.println(secCar.airConditioner); 
		 ((Car)arrVehicle[0]).openDoor();
		
	}

}
