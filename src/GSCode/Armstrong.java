package GSCode;

public class Armstrong {
	public static void main(String[] args) {
		String str = "153";
		Integer sum=0;
		for (char ch : str.toCharArray()) {
			int i=ch;
			i=i-48;
			sum=sum+(i*i*i);
		}
		System.out.println(str.equals(sum.toString())+" :"+sum);

	}
}
