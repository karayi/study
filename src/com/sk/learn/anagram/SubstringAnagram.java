package com.sk.learn.anagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringAnagram {

	static Map<Character, Integer> getHashMap(String text) {
		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
		if (text != null && text != " ") {
			for (int m = 0; m < text.length(); m++) {
				if (text.charAt(m) != ' ') {
					if (hashMap.containsKey(text.charAt(m))) {
						hashMap.put(text.charAt(m), hashMap.get(text.charAt(m)) + 1);
					} else {
						hashMap.put(text.charAt(m), 1);
					}
				}
			}
		}
		return hashMap;
	}

	public static void main(String[] args) {

		String text = "abdcghbaabcdij";
		String pattern = "bcda";
		List<Integer> result = new ArrayList<Integer>();
		Map<Character, Integer> patterMap = getHashMap(pattern);
		for(int i=0;i<=text.length()-pattern.length();i++){
			String textSub = text.substring(i, i+pattern.length());
			if(patterMap.equals(getHashMap(textSub))){
				result.add(new Integer(i));
			}
		}
		System.out.println(result.toString());
	}

}
