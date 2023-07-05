package codeSample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InternExample {
	public static void main(String[] args) {
		/*
		 * String s1=new String("Pooja"); String s2="Pooja"; String s3=s1.intern();
		 * System.out.println(s1==s2); System.out.println(s1==s3);
		 * System.out.println(s2==s3);
		 */
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s4));

		String str = "aaa bbb aaa ddd fffff bbb";
		List<String> mylist=Arrays.asList(str.split(" "));
		Set set=new HashSet<>();
		Map map=mylist.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		map.forEach((i,j)->System.out.println(i+":"+j));
	}

}
