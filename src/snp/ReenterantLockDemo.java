package snp;

import java.util.concurrent.locks.ReentrantLock;

public class ReenterantLockDemo {
	private static ReentrantLock lock = new ReentrantLock();

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			ReenterantLockDemo.accessResourse();
		});
		Thread t2 = new Thread(() -> {
			ReenterantLockDemo.accessResourse();
		});
		Thread t3 = new Thread(() -> {
			ReenterantLockDemo.accessResourse();
		});
		Thread t4 = new Thread(() -> {
			
			ReenterantLockDemo.accessResourse();
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

	public static void accessResourse() {
		lock.lock();
		for (int i = 0; i < 5; i++) {
			System.out.println("current thread " + Thread.currentThread().getName());
		}
		ReenterantLockDemo.bookSeat();
		lock.unlock();
	}

	public static void bookSeat() {
		System.out.println("book seat");
	}
}
