
public class Program {

	public static void main(String[] args) {
	  Base objBase = new Base();	//base inherant base
	  objBase.iBase=1;
	  objBase.iBasePackage=2;
	  objBase.iPublic=3;
	  System.out.println("1)*****************");
	  objBase.show();  //
	  
	  System.out.println("2*****************");
	  
	  Drived objDrived = new Drived();//drived inherant base ,drived
	  
	  System.out.println("3*****************");
	  objDrived.iBase=10;
	  objDrived.iBasePackage=20;
	  objDrived.iPublic=30;
	  objDrived.iDerived=40;
	 
	  System.out.println("4*****************");
	  
	  objDrived.show();
	  objDrived.display();
	  
	  System.out.println("5*****************");
	  
	 DrivedMost objMost = new  DrivedMost(); //drivedmost inherant base ,drived and drivedmost
	  
     System.out.println("*****************");
	   objMost.test();
	
	}

}
