package codeSample;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashSet {
	public static void main(String[] args) {
ConcurrentHashMap<String, Integer> map=new ConcurrentHashMap<>();
Set set=map.newKeySet();
set.add("pooja");
	}
}
