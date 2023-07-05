package multithreading;

public class Singletone {

	public static Singletone instance;

	private Singletone() {

	}

	public static Singletone getInstance() {
		if (instance == null) {
			synchronized (Singletone.class) {
				if (instance == null) {
					instance = new Singletone();
				}
			}
		}
		return instance;
	}
}
