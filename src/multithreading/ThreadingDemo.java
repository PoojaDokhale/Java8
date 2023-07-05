package multithreading;

public class ThreadingDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread th1=new Thread1();
//		th1.setDaemon(true);
		Thread2 th2=new Thread2();
		Thread th=new Thread(th2);
		th1.start();
		th.start();
	}

}
