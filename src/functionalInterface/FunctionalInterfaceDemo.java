package functionalInterface;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

	public void test();
	
//	public void test2();

//	default int hashCode() {
//		return 5*7;
//	}
	
	default void print() {
		System.out.println("Functional interface");
	}

}
