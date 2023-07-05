package GSCode;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {

	public static void main(String[] args) {
		String str = "Better Butter";
		char[] chararr = str.replaceAll("\\s+", "").toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < chararr.length; i++) {
			if (!map.isEmpty()) {
				if (map.containsKey(chararr[i]))
					map.put(chararr[i], map.get(chararr[i]) + 1);
				else
					map.put(chararr[i], 1);
			} else {
				map.put(chararr[i], 1);
			}
		}
		map.forEach((i,j)->System.out.println("Char "+i+ " :"+j));
	}

}
