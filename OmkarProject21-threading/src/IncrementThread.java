public class IncrementThread extends Thread {
	
	public void run() {
		try {
			while(true)
			{
				System.out.println("increments");
				Thread.sleep(20);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
