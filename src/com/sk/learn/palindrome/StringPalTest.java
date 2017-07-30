package com.sk.learn.palindrome;

import java.util.Scanner;

public class StringPalTest {

	public static void main(String[] args) {
		String originalStr;
		StringBuilder reverseStr = new StringBuilder();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter you string to check palindrome!");
		originalStr = in.nextLine();
		
		for(int i = originalStr.length()-1; i>=0; i--){
			reverseStr = reverseStr.append(originalStr.charAt(i));
		}
		if(originalStr.equals(reverseStr.toString())){
			System.out.println("Palindrome!!!");
		}else{
			System.out.println("Not Palindrome!!!");
		}
	}

}
