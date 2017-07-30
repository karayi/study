package com.sk.learn;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
  public static void main(String[] args) throws IOException {
	  String nums = "1 1 3 3 3 2 2 2 2 14 14 14 11 11 11 2 ";
	  

	  int[] ss = Arrays.stream(nums.split("\\s")).map(String::trim).mapToInt(Integer::parseInt).toArray();
	  
	  int count = 0;
	  int val = ss[0];
	  for (int i = 0; i < ss.length; i++) {
		  
		if(val == ss[i]){  
			count++;
		}else{
			System.out.println(count+" "+val);
			count = 0 ;
			val = ss[i];
			count++;
		}
		
		if(i == ss.length-1){
			System.out.println(count+" "+val);
		}
				
	}
	  
  }
}
