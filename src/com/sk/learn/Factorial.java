package com.sk.learn;

public class Factorial {
	
	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.factorial(4));
	}
	
	public int factorial(int num){
		if(num == 1){
			return 1;
		}else{
			return num * factorial(num-1);
		}
	}

}
