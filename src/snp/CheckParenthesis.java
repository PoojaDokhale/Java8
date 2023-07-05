package snp;

import java.util.Stack;

public class CheckParenthesis {
	public static void main(String[] args) {
		String str1 = "[()()]";

		
		char[] charArray = str1.toCharArray();
		System.out.println(balance(charArray));
	}

	private static Boolean balance(char[] charArray) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (ch == '[' || ch == '{' || ch == '(') {
				stack.push(ch);
				continue;
			}
			if (stack.empty()) {
				return false;
			}
			char popChar;
			switch (ch) {
			case ']': {
				popChar = (char) stack.pop();
				if (popChar == '{' || popChar == '(')
					return false;
				break;

			}
			case '}': {
				popChar = (char) stack.pop();
				if (popChar == '(' || popChar == '[')
					return false;
				break;

			}
			case ')': {
				popChar = (char) stack.pop();
				if (popChar == '{' || popChar == '[')
					return false;
				break;

			}

			}
		}
		return true;
	}

}
