package streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighetNumber {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,51,21,25,6,5,3,7);
		System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
	}

}
