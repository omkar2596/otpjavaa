//multithreading

public class Program {

	public static void main(String[] args) throws Exception {
		IncrementThread  incThread = new IncrementThread();
//		incThread.run();//as kraych nahi bez hey simple 'synchronization honar'..means main mdun janar...means regular fun call honar
		incThread.start();//jvm la signal taknar ...os through direct cpu time milnar...bez 'start' ahe.. ha fun nahi ahe
        
		DecrementThread  decThread = new DecrementThread();
		Thread objThread = new Thread(decThread);//'implement kelamule obj crate krava lgnar mg ''start 'vaprata yenar like line no 8'
		objThread.start();
		while(true)
		{
			System.out.println(".......main......");
			Thread.sleep(10);//line no 5 muley throw houn 20ms dealy hoto 
		}
		
	}

}

//line no 8& 12(worker) jab tak end nahi honar tab tank 'demaon'end nahi honar...means apn ya condition la stop nahi karu shkat mhnun tey continue run hotey ..'OmkarProject 21'mdey stop hotey see





