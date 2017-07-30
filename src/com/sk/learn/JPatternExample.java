package com.sk.learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JPatternExample {
	
	public static void main(String args[]){
		
		String str = "Java 100 Javascript 200 Angular 300 Silverlight 400";
		Pattern pattern = Pattern.compile("[a-zA-Z]+\\s(\\d)+");
		Matcher matcher = pattern.matcher(str);
		
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		
		
		
	}

	
}
