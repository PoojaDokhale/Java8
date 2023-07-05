package snp_VIDHI;

public class StringPalindrom {
	public static void main(String[] args) {
		String str = "nayanad";
		if (str.equals(rev(str))) {
			System.out.println(str + " is Palindrom");
		}
		else {
			System.out.println("not");
		}
	}

	private static String rev(String str) {
		char[] ch = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		return rev;
	}

}
