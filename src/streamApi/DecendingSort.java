package streamApi;

import java.util.ArrayList;
import java.util.List;

public class DecendingSort {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(46);
		arrayList.add(15);
		arrayList.add(18);

//		arrayList.stream().sorted((i,j)->j.compareTo(i)).forEach(i -> System.out.println(i));
		
		System.out.println("min "+arrayList.stream().min((i,j)-> i.compareTo(j)).get());
		System.out.println("max: "+arrayList.stream().max((i,j)-> i.compareTo(j)).get());
		
		
	}
}
