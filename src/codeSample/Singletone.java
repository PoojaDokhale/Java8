package codeSample;

public class Singletone {
	private static Singletone singleObj;

	private Singletone() {

	}

	public static Singletone getInstance() {
		if (singleObj == null) {
			singleObj = new Singletone();
		}
		return singleObj;
	}

}
