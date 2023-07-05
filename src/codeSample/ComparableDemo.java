package codeSample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	
	public static void main(String[] args) {
		Auther a1 = new Auther("Pooja", "Aware", 31);
		Auther a2 = new Auther("Sunil", "Aware", 32);
		Auther a3 = new Auther("Abc", "Apk", 23);
		Auther a4 = new Auther("Nayan", "Dokhale", 15);
		Auther a5 = new Auther("Akshada", "adhyapak", 21);

		List<Auther> autList = new ArrayList<>();
		autList.add(a1);
		autList.add(a2);
		autList.add(a3);
		autList.add(a4);
		autList.add(a5);
		
//		Collections.sort(autList);
		autList.stream().filter(i->i.getSurName().startsWith("A")).forEach(i->System.out.println(i));
//		autList.forEach(i->System.out.println(i.toString()));
		
		String str1="String";
        String str2=new String("String");
        String str3=new String("String").intern();





      System.out.println(str1==str2);  
        System.out.println(str1==str3);
        System.out.println(str2==str3);
        System.out.println(str2.equals(str3));
	}
	

}
