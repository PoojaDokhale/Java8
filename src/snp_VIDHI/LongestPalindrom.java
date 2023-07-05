package snp_VIDHI;

import java.util.Scanner;

public class LongestPalindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to test Palindrom");
		String str = sc.nextLine();
		checkPalindrom(str);

	}

	private static void checkPalindrom(String str) {
		String maxPalindrom = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (i < str.length()) {
					String subString = str.substring(i, j+1);

					// subString = subString + revString(subString);
					if (subString.equals(revString(subString))) {
						
						if (str.contains(subString) && subString.length() > maxPalindrom.length()) {
							maxPalindrom = subString;
						}
					}
				}
			}
		}
		System.out.println("Longest palindrom is :" + maxPalindrom + " and Length is" + ":" + maxPalindrom.length());

	}

	private static String revString(String str) {
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;
	}

}
