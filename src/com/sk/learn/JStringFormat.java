package com.sk.learn;

import java.util.Scanner;

public class JStringFormat {
public static void main(String[] args) {
	//System.out.println("Hi Enter your technology and its mark");
	//Java 10 67
	//Java                           50 050
	//Scanner scanner = new Scanner(System.in);
	
	//System.out.print(String.format("%1$-16s %2$16d %3$03d",scanner.next(), scanner.nextInt(), scanner.nextInt()));

	String ss = "Java 10";
	System.out.print(String.format("%1$-16s", ss));
	
	//scanner.close();
	
	
}
}
