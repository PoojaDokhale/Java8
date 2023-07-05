package snp;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class ReadWriteLockExample {
	private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	private static ReadLock readLock = lock.readLock();
	private static  WriteLock writeLock= lock.writeLock();
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			ReadWriteLockExample.viewSeat();
		});
		Thread t2 = new Thread(() -> {
			ReadWriteLockExample.viewSeat();
		});
		Thread t3 = new Thread(() -> {
			ReadWriteLockExample.bookSeat();
		});
		Thread t4 = new Thread(() -> {
			ReadWriteLockExample.bookSeat();
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
	public static void viewSeat() {
		readLock.lock();
		for (int i = 0; i < 10; i++) {
			System.out.println("inside view seat: "+i+" "+Thread.currentThread().getName());
			
		}
		
		readLock.unlock();
	}

	public static void bookSeat() {
		writeLock.lock();
		for (int i = 0; i < 10; i++) {
			System.out.println("inside Book seat : "+i+" "+Thread.currentThread().getName());
			
		}
		writeLock.unlock();
	}
}
