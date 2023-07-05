package codeSample;

public class ReverseStringSpecchjar {

	public static void rev(char str[], int sIndex, int len) {
		for (int i = sIndex; i < len / 2; i++) {
			char t = str[i];
			str[i] = str[len - 1 - i];
			str[len - 1 - i] = t;
		}
	}

	public static void reverse(char str[]) {
		// creating a character array of the size
		// equal to the length of the string
		char[] t = new char[str.length];
		int x = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i] >= 'a' && str[i] <= 'z' || str[i] >= 'A' && str[i] <= 'Z') {
				// storing the elements in the array
				t[x] = str[i];
				x++;
			}
		}

		// reverse the character array
		rev(t, 0, x);

		x = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i] >= 'a' && str[i] <= 'z' || str[i] >= 'A' && str[i] <= 'Z') {
				// update the original string
				str[i] = t[x];
				x++;
			}
		}

		String rS = new String(str);
		System.out.println(" The string after reversing is: " + rS);
	}

	// Main Code
	public static void main(String args[]) {
		String s = "aB,C,De!$";
		char[] cA = s.toCharArray();
		reverse(cA);
	}
}
