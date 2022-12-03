//multithreading
//ha program line no18 jo apn time denar to complete zalavr stop honar
public class Program {

	public static void main(String[] args) throws Exception {
		IncrementThread  incThread = new IncrementThread();
       incThread.setDaemon(true);//daeemon use to stop //hey line zr hide keley tari program infinte time la clnar//HA WORKER THREAD AHE
		incThread.start();
        
		DecrementThread  decThread = new DecrementThread();
		Thread objThread = new Thread(decThread); 
        objThread.setDaemon(true);//daeemon use to stop //HA WORKER THREAD AHE
		objThread.start();
		
		for(int iTmp=0;iTmp<100;iTmp++)
		{
			System.out.println(".......main......");//main honey key baad program stop huwa
			Thread.sleep(10);//jo time denar tey zalvr stop honar
		}	 
		
		
	}

}
//jopyat worket thread end hot nahi topyat demaon thread end hot nahi