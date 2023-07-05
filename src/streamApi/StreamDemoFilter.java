package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemoFilter {
	public static void main(String[] args) {
		List<Integer> arrayList=new ArrayList<>();
		arrayList.add(25);
		arrayList.add(5);
		arrayList.add(10);
		
		List<Integer> newList=arrayList.stream().filter(i -> i>=10).collect(Collectors.toList());
		newList.stream().forEach((i)->System.out.println(i));
		
		//arrayList.stream().filter(i -> i>=10).forEach(j -> System.out.println(j));
	}
	

}
