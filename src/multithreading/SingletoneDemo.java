package multithreading;

public class SingletoneDemo {
	public static void main(String[] args) {
		Singletone s1 = Singletone.getInstance();
		Singletone s2 = Singletone.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
