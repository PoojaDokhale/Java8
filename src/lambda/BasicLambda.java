package lambda;

import java.util.function.BiConsumer;

public class BasicLambda {
	public static void main(String args[]) {
		
//		BasicLambda demo=new BasicLambda();
//		System.out.println(demo.add(10,5));
		BiConsumer<Integer, Integer> bicon=(a,b)-> System.out.println(a+b);
			bicon.accept(10, 8);
	}
	public int add(int a, int b) {
		return a+b;
	}
}


