package snp_VIDHI;

import java.io.Serializable;

public class Singletone extends MyClone implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Singletone instance = null;

	private Singletone() {
		if (instance != null) {
			throw new IllegalArgumentException("reflaction not allowed");
		}
	}

	public Object readResolve() {
		System.out.println("Executing readResolve");
		return instance; 
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();

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
