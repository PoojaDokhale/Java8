package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionalInterfaces {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate=(i,j) -> i+j>=20;
		System.out.println(biPredicate.test(2, 12));
		
	BiFunction<Integer, Integer, Integer> bifun= (i,j) -> (i*j)/100;
	System.out.println(bifun.apply(5, 3));
	
	BiConsumer<Integer, Integer> bicon=(i,j) -> System.out.println(i*j);
bicon.accept(8, 9);
	}

}
