package multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ComplitableFuture {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 9, 14);

		try {
			list.stream().map(num -> CompletableFuture.supplyAsync(() -> getNumber(num))).peek(i->System.out.println(i))
					.map(CompletableFuture -> CompletableFuture.thenApply(n -> n * n)).map(t -> t.join())
					.forEach(s -> System.out.println(s));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static int getNumber(int a) {
		return a * a;
	}

}
