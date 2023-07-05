package GSCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "LISTEN";

		String str2 = "SILENT";
		char[] ch = str1.toCharArray();
		for (int i = 0; i < ch.length-1; i++) {
			if (ch[i] > ch[i + 1]) {
				char temp = ch[i];
				ch[i] = ch[i+1];
				ch[i+1] = temp;
				i=-1;
			}
			
		}
		System.out.println(ch);
		List<String> list = new ArrayList<>();
		list.add(str1);
		list.add(str2);

		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		System.out.println(Arrays.equals(charArr1, charArr2));
	}

}
