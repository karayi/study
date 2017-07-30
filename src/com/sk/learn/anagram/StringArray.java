package com.sk.learn.anagram;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringArray {
	
	public static void main(String[] args) {
		
		String [][] strArr = new String[3][2];
		strArr[0][0] = new String("Item1");
		strArr[0][1] = new String("Item2");
		strArr[1][0] = new String("Item3");
		strArr[1][1] = new String("Item4");
		strArr[2][0] = new String("Item4");
		strArr[2][1] = new String("Item5");
		
		StringArray obj = new StringArray();
		obj.printArray(strArr);
		
	}
	
	public void printArray(String[][] arr){
		System.out.println("Array size - Rows : "+arr.length +" Column : "+arr[0].length);
		List<Set<String>> sets = new ArrayList<Set<String>>();
		
		for (int i = 0; i < arr.length; i++) {
			Set<String> set = new LinkedHashSet<String>();
			for (int j = 0; j < arr[i].length; j++) {
				set.add(arr[i][j]);
			}
			sets.add(set);
		}
		
		sets.forEach(set ->{
			System.out.println(set);
		});
		
		
	}

}


