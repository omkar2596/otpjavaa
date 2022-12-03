
public class Program {

	public static void main(String[] args) {
		//OtpThread otpThread = new OtpThread();
		//Thread objThread = new Thread(otpThread);
		//objThread.start();
		
		new Thread(new otpThread()).start(); //line no 5,6,7 cha badli '9'line ekatch shotcut lihta yetey
		

	}

}
