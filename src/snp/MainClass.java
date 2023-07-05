package snp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
	public static void main(String[] args) {

		Student st1 = new Student(1, Arrays.asList(1, 2, 3, 4, 5, 6));
		Student st2 = new Student(2, Arrays.asList(2, 3, 4, 5, 7));
		Student st3 = new Student(3, Arrays.asList(2, 3, 4, 5, 7));
		Student st4 = new Student(4, Arrays.asList(1, 2, 3, 4, 5, 6));
		Student st5 = new Student(5, Arrays.asList(8, 9, 10, 5, 7));
		Student st6 = new Student(6, Arrays.asList(80, 9, 10, 50, 7));
		
		
		List<Student> stuList1 = new ArrayList<>();
		List<Student> stuList2 = new ArrayList<>();
		List<Student> stuList3 = new ArrayList<>();
		
		stuList1.add(st1);
		stuList1.add(st2);
		
		stuList2.add(st3);
		stuList2.add(st5);
		
		stuList3.add(st6);
		
		Section s1 = new Section("A", stuList1);
		Section s2 = new Section("B", stuList2);
		Section s3 = new Section("C", stuList3);
		
		
		List<Section> secList = new ArrayList<>();
		secList.add(s1);
		secList.add(s2);
		secList.add(s3);

		/*
		 * List<List<Integer>> collect = secList.stream()
		 * .collect(Collectors.toMap(i->i.getSecName(), i->i.getStdsList().stream()
		 * .flatMap(i-> i.getMarksList().stream().reduce((a,b)->a+b).get()))
		 */

		secList.stream().collect(Collectors.toMap(i->i.getSecName(), j->j.getStdsList()
				.stream().flatMap(i->i.getMarksList().stream().peek(x->System.out.println(x))
						.collect(Collectors.toList()).stream()))).forEach((i,j)->{
							System.out.println(i);
							j.count();
							
						});;
		

		//collect.forEach((i, j) -> System.out.println(i + ":" + j.peek(x->System.out.println(x)).findFirst()));
		int a[] = { 2, 5, 11, 31, -12, 78, 0, -10 };
		//a = sort(a);

//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//
//		}

	}

	private static int[] sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] > a[i + 1]) {

				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				i = -1;
			}

		}
		return a;
	}
}
