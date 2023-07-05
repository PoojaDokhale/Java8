package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(15);
		arrayList.add(18);
		arrayList.add(46);
		
		arrayList.stream().map((i) -> i*i).forEach(s-> System.out.println(s));
		List<Integer> newArray=arrayList.stream().map(i -> i*i).collect(Collectors.toList());
		newArray.stream().forEach(s-> System.out.println(s));
	}
}
