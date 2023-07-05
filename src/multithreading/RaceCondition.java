package multithreading;

public class RaceCondition {
	public static void main(String[] args) {
		Counter c=new Counter();
		Thread th=new Thread(()->{
			c.increment();
		});
		Thread th2=new Thread(()->{
			c.increment();
		});
		th.start();
		th2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c.getI());
	}
	static class Counter{
		int i;
		public Counter() {
			// TODO Auto-generated constructor stub
			i=5;
		}
		public int getI() {
			return i;
		}
		public void setI(int i) {
			this.i = i;
		}
		public void increment() {
			for (int i = 0; i < 10; i++) {
i++;				
			}
		}
	}

}
