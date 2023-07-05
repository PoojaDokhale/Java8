package streamApi;

import java.util.ArrayList;
import java.util.List;

public class PeekAndReduceDemo {

	
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();

		arrayList.add(15);
		arrayList.add(18);
		arrayList.add(46);
		
//		arrayList.stream().filter(i-> i%2 == 0).peek(System.out::println).count();
		
		System.out.println(arrayList.stream().reduce((a,b)-> a+b).get());

	}

}
