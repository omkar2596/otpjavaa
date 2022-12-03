package employe.in;

public class Engineer extends Employe {
   protected float overTime;

public Engineer(String name, String address, int age, boolean gender, float basicSalary, float overTime) {
	super(name, address, age, gender, basicSalary);
	this.overTime = overTime;
}



public float getOverTime() {
	return overTime;
}

public void setOverTime(float overTime) {
	this.overTime = overTime;
}
   
   


}
