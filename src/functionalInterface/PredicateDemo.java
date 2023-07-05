package functionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {
//	Predicate<T> ,check boolean //return boolean
	public static void main(String[] args) {
		PredicateDemo ob=new PredicateDemo();
//		System.out.println("check length of shdjkhsakj  "+ob.checklength("shdjkhsakj"));
	/*	Predicate<String> pre = (s)->  s.length() >= 5;
		
		Predicate<String> pre2 = (s) -> s.length() <=10;
		
		System.out.println("check length of shdjkhsakj  "+pre.and(pre2).test("code223jfk"));
		System.out.println("check length of shdjkhsakj  "+pre.or(pre2).test("code223jfkiuiuoiuou"));
		System.out.println("check length of shdjkhsakj  "+pre.negate().test("code"));
		*/
Predicate<Integer> pre = (s)->  s >= 18;
		
		Predicate<Integer> pre2 = (s) -> s <=60;
		
		System.out.println("check length of shdjkhsakj  "+pre.and(pre2).test(20));
		System.out.println("check length of shdjkhsakj  "+pre.or(pre2).test(20));
		System.out.println("check length of shdjkhsakj  "+pre.negate().test(20));
	}

	public Boolean checklength(String s) {
		if (s.length() <= 5)
			return false;
		return true;
	}

}
