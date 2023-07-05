package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
	public static void main(String[] args) {
			/*ExecutorService eService=Executors.newFixedThreadPool(10);
			
			for (int i = 0; i < 10; i++) {
				eService.execute(new Thread1());
			}*/
			int cpu=Runtime.getRuntime().availableProcessors();
			ExecutorService eService=Executors.newFixedThreadPool(cpu);
			
			for (int i = 0; i < 5; i++) {
				eService.execute(new CPUIntensive());
				
			}
	}
}
