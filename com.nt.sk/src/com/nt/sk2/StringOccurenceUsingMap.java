package com.nt.sk2;
import java.util.HashMap;
import java.util.Map;

public class StringOccurenceUsingMap {
	
	public static void GetCharCount(String name) {
		Map<Character, Integer> charMap=new HashMap<>();
		char strArray[]=name.toCharArray();
		for (char c : strArray) {
			if (!String.valueOf(c).isBlank()) {
				if (charMap.containsKey(c)) {
					charMap.put(c, charMap.get(c)+1);
			}
			else
				charMap.put(c, 1);
			}
		}
		System.out.println(name+": "+charMap);
	}
	public static void main(String[] args) {
		GetCharCount("shashi");
		GetCharCount("shashi kumar kondoju");
		GetCharCount("   ");
	}

}
