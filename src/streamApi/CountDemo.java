package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountDemo {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(15);
		arrayList.add(18);
		arrayList.add(46);
		
		Long i=arrayList.stream().filter( j-> j%2 ==0).count();
		System.out.println(i);
		
	}
}
