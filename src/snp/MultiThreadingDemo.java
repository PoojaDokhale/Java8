package snp;

public class MultiThreadingDemo {
	public static void main(String[] args) {
		Thread th1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Inside 1st ob " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread th2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Inside 2nd ob " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		th1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th2.start();
		System.out.println("Inside Main");
	}

}
