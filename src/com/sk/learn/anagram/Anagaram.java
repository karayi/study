package com.sk.learn.anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagaram {
public static void main(String[] args) {
	boolean status = false;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter first string!");
	String s1 = in.nextLine();
	System.out.println("Enter second string!");
	String s2 = in.nextLine();
	in.close();
	System.out.println("S1 = "+s1 + ",S2 = "+s2);
	
	String cpyS1 = s1.replaceAll("\\s", "");
	String cpyS2 = s2.replaceAll("\\s", "");
	
	if(cpyS1.length() != cpyS2.length()){
		status = false;
	}else{
		char[] s1Arr = cpyS1.toLowerCase().toCharArray();
		char[] s2Arr = cpyS2.toLowerCase().toCharArray();
		//Sorting array
		Arrays.sort(s1Arr);
		Arrays.sort(s2Arr);
		status = Arrays.equals(s1Arr, s2Arr);
	}
	if(status){
		System.out.println("Anagram ");
	}else{
		System.out.println("Not Anagram");
	}
}
}
