package multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadpool {
	public static void main(String[] args) {
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
		//executorService.schedule(new Thread2(), 2, TimeUnit.SECONDS);
	//	executorService.scheduleAtFixedRate(new Thread2(), 15, 10, TimeUnit.SECONDS);
		executorService.scheduleWithFixedDelay(new Thread2(), 15, 5, TimeUnit.SECONDS);
	}
}
