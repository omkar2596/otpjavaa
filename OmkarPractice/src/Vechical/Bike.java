package Vechical;

public class Bike extends Vechicle {
	
	int kickStarter;
	
	

	public Bike(int engine, int chasis, int tyres, int kickStarter) {
		super(engine, chasis, tyres);
		this.kickStarter = kickStarter;
	}
	

	public int getKickStarter() {
		return kickStarter;
	}

	public void setKickStarter(int kickStarter) {
		this.kickStarter = kickStarter;
	} 
	
	public void wheely() 
	 { 
	 System.out.println("Doing a wheely"); 
	 } 

}
