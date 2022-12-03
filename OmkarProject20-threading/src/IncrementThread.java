//extends keley ahe mhnun direct call see 'program line 8'

public class IncrementThread extends Thread {
	
	public void run() {
		try {
			while(true)
			{
				System.out.println("increment");
				Thread.sleep(20);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
