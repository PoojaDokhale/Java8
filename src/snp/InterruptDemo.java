package snp;

public class InterruptDemo {
	public static void main(String[] args) {
		Thread th1 = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("Inside 1st ob " + i);
				try {
					Thread.sleep(100000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread th2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Inside 2nd ob " + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		th1.start();
		th2.start();
		th2.interrupt();
	}
}
