package functionalInterface;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {

		Supplier<String> supp=() -> "supplier Demo";
		System.out.println(supp.get());	
	}

}
