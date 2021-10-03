package com.nt.Test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test3 {
	public static void printDuplicateChar(String str) {
		
	String str1=str.toLowerCase();
	char[] ch=str1.toCharArray();
	Map<Character, Integer>CharMap=new HashMap<>();
	for (char c : ch) {
		if (CharMap.containsKey(c)) {
			CharMap.put(c, CharMap.get(c)+1);
		}
		else {
			CharMap.put(c, 1);
		}
	}
	Set<Map.Entry<Character, Integer>>entrySet=CharMap.entrySet();
	for (Map.Entry<Character, Integer> entry : entrySet) {
		if (entry.getValue()>1) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}
}

	public static void main(String[] args) {
		printDuplicateChar("Programming");
	}

}
