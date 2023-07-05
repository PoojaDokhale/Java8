package codeSample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Autherstream{

	public static void main(String[] args) {
		Auther a1 = new Auther("Pooja", "Aware", 31);
		Auther a2 = new Auther("Sunil", "Aware", 32);
		Auther a3 = new Auther("Sbc", "Apk", 23);
		Auther a4 = new Auther("Nayan", "Dokhale", 15);
		Auther a5 = new Auther("Akshada", "adhyapak", 21);
		  Comparator<Auther> compareByName = Comparator
                  .comparing(Auther::getFirstName)
                  .thenComparing(Auther::getAge);
		  List<Auther> autList = new ArrayList<>();
			autList.add(a1);
			autList.add(a2);
			autList.add(a3);
			autList.add(a4);
			autList.add(a5);
	int[] x= {1,2,3,4,5};
			
//			autList.stream().sorted(Comparator.comparing(Auther::getAge).reversed()).forEach(i-> System.out.println(i.toString()));
		  autList.stream().collect(Collectors.toList()).forEach(i->System.out.println(i));
//  Set<Auther> set1=new HashSet<>();
//  
//  set1.add(a1);
//  set1.add(a3);
//  
//  set1.forEach(i->System.out.println("fgdfg"+i));
//  
//  
//		List<Auther> autList = new ArrayList<>();
//		autList.add(a1);
//		autList.add(a2);
//		autList.add(a3);
//		autList.add(a4);
//		autList.add(a5);
//
//		autList.stream().filter(i -> i.getAge() > 20).map(i -> i.getSurName().toUpperCase())
//				.collect(Collectors.toSet()).forEach(i->System.out.println(i.toString()));
//	
//		String str="Pooja";
//		Character lastchr = null;
//		for (char ch : str.toCharArray()) {
//			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
//				
//				lastchr=ch;
////				break;
//			}
//			
//		}
//		System.out.println("first non reaping char :"+lastchr);
	}

}
