package multithreading;

public class CPUIntensive implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("CPU Intensive");
			
		}
		
	}

}
