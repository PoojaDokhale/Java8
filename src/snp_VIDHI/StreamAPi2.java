package snp_VIDHI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPi2 {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> l2 = Arrays.asList(9, 4, 2, 7);
		List<Integer> l3 = Arrays.asList(7, 3, 4);

		List<List<Integer>> finalList = new ArrayList<>();
		finalList.add(l1);
		finalList.add(l2);
		finalList.add(l3);

		finalList.stream().collect(Collectors.toMap(i -> i.stream().mapToInt(Integer::valueOf).sum(), j -> j))
				.forEach((x, y) -> System.out.println(x + ": " + y));
	}

}
