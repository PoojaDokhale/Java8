package snp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintSpecArrayIndexEle  {
	public static void main(String[] args) {
		Integer[] array1 = { 1, 2, 4, 5, 8, 6 };
		
		List<List<Integer>> mylist=new ArrayList<>();
		mylist.add(Arrays.asList(Arrays.copyOfRange(array1, 2, array1.length)));
		mylist.add(Arrays.asList(Arrays.copyOfRange(array1, 0, 2)));
		
		mylist.stream().flatMap(i->i.stream()).collect(Collectors.toList()).forEach(i->System.out.println(i));
		
	}

}
