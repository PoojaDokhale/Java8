package codeSample;

public class SingletoneDemo {
	
	public static void main(String[] args) {
		Singletone singletone1=Singletone.getInstance();
		Singletone singletone2=Singletone.getInstance();
		System.out.println(singletone1);
		System.out.println(singletone2);
	}
}
