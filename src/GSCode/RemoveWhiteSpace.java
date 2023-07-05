package GSCode;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String sentence = " how to do in java ";
		System.out.println("Original sentence: " + sentence);

		System.out.println("After replacement: " + sentence.replaceAll("\\s+", ""));
	}
}
