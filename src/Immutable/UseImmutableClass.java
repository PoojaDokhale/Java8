package Immutable;

public class UseImmutableClass {
	public static void main(String[] args) {
		ImmutableClass i=new ImmutableClass(10);
		ImmutableClass j=new ImmutableClass(3);
		ImmutableClass k=i;
		ImmutableClass m=i.modify(1);

	}

}
