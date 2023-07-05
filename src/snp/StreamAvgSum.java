package snp;

import java.util.Arrays;
import java.util.List;

public class StreamAvgSum {
	
	public static void main(String[] args) {
		List<Integer> mylist=Arrays.asList(12, 3, 4, 1, 6, 9);
		
		System.out.println(mylist.stream().mapToInt(Integer::intValue).sum());
		System.out.println(mylist.stream().mapToInt(Integer::intValue).average());
		
	}

}
