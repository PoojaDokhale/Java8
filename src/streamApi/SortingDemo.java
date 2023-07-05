package streamApi;

import java.util.ArrayList;
import java.util.List;

public class SortingDemo {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(46);
		arrayList.add(15);
		arrayList.add(18);
	try {
		int i=5/0;
		
	}catch (Exception e) {
		System.out.println("outside catch");
		try {
			int i=5/0*0;
		} catch (Exception e2) {
			System.out.println("inside catch");
		}
	}
		
		arrayList.stream().sorted().forEach(i-> System.out.println(i));
	}
}
