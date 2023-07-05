package multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Future<Integer> future = executorService.submit(new Task());
		System.out.println("Hi I am in Main Thread1");
		System.out.println("Hi I am in Main Thread2");
		System.out.println(future.get());
		
		System.out.println("Hi I am in Main Thread3");
		System.out.println("Hi I am in Main Thread4");
	}

	static class Task implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			List<Integer> myList = Arrays.asList(1, 2, 4, 6, 7);
			Thread.sleep(100000);
			return myList.stream().reduce((a, b) -> a + b).get();
		}

	}
}
