package Immutable;

final public class ImmutableClass {
	private int i;

	public ImmutableClass(int i) {
		this.i = i;
	}

	public ImmutableClass modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new ImmutableClass(i);
		}
	}

}
