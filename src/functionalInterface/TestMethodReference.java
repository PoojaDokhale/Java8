package functionalInterface;

public class TestMethodReference implements FunctionalInterfaceDemo{
	
	public static void main(String[] args) {
		FunctionalInterfaceDemo f=demo::test;
		f.test();
		
		demo demoOb=new demo();
		FunctionalInterfaceDemo f1 = demoOb:: nonStaticMethod;
		f1.test();
	}

	public void print() {
		System.out.println("child class");
	}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}
