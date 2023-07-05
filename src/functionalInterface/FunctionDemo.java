package functionalInterface;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		FunctionDemo demo=new FunctionDemo();
		
//		System.out.println(demo.square(2, 5));
		
		Function<Integer, Integer> squ = (i) -> 2*i;
//		System.out.println(squ.apply(2));
		
		Function<Integer, Integer> trip = (i) -> i*i*i;
		System.out.println(trip.apply(2));
		
		System.out.println(squ.andThen(trip).apply(2));
		System.out.println(squ.compose(trip).apply(2));
	}
	
	public int square(int i,int j) {
		return i*j;
	}

}
