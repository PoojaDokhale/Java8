package functionalInterface;

public class demo {
	
	public static void main(String[] args) {
//		FunctionalInterfaceDemo f= ()-> System.out.println("lambda test using functional interface");
//		f.test();
		FunctionalInterfaceDemo f=null;
		test(()->System.out.println("I am from MAIN"));
		demo.test(f);
	}
	
	public static void test(FunctionalInterfaceDemo fid) {
		fid.test();
		System.out.println("Test Method Reference for static method");
	}
	public static void test() {
		System.out.println("Test Method Reference for static method");
	}
	public void nonStaticMethod() {
		System.out.println("Test Method Reference for non static method");
	}

}

