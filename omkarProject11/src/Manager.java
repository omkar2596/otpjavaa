

public class Manager extends Employe {
	   protected float hra;

	   
	 

	public Manager(String name, String address, int age, boolean gender, float basicSalary, float hra) {
		super(name, address, age, gender, basicSalary);
		this.hra = hra;
	}

	public float getHra() {
	   	return hra;	
	   }

	   public void setHra(float hra) {
	   	this.hra = hra;
	   }
	      
	        
	   public float computeSalary() {  //polymarphism use //methode overriding
		   System.out.println("Compute salary of Manager");
		   return basicSalary + hra;
	   }

}
