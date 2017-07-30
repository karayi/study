package com.sk.learn;

import java.util.Scanner;

public class FormulaEx {

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		/*int t = scanner.nextInt();
		double result=0;
		for (int i=0;i<t;i++){
			int a = scanner.nextInt(); // 0
			int b = scanner.nextInt(); // 2
			int n = scanner.nextInt(); // 10
						
			for(int j=0; j<n; j++){
				result = a;
				for(int k=0;k<=j;k++){
					result = result+(Math.pow(2, k)*b);
				}
				System.out.print((int)result+" ");
			}
			System.out.println("\r");
		}
		scanner.close();*/
		
		System.out.println("In");
		long num = scanner.nextLong();
		if(num>-128 && num <127){
			System.out.println("It can hold in byte");
		}
		
		scanner.close();
	}
}
