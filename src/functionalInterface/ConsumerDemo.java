package functionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<Integer> consume = (i) -> System.out.println("employee number is "+i);
		consume.accept(5);
	}

}
