package codeSample;

import java.util.List;

public class SumOfSquare {
	public static void main(String[] args) {
		List<Integer> mylist=List.of(1,2,3,4);
		System.out.println(mylist.stream().filter(i->i%2==0).map(i->i*i).reduce((a,b)->a+b).get());
		System.out.println(mylist.stream().filter(i->i%2==0).map(i->i*i).mapToInt(Integer::valueOf).sum());
	}

}
