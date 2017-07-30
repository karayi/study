package com.sk.learn;

import java.util.Date;
import java.util.HashMap;

public class HashEqualEx {
	 public static void main(){
		 
	 }
	 
	 

}

class Employee{
	
	String id;
	String dob;
	Employee(String theId, String theDob){
		id = theId;
		dob = theDob;
	}
	public HashMap<Employee, String> getEmployee(){
		HashMap<Employee, String> empMap = new HashMap<Employee, String>();
		Employee em1 = new Employee("100", "02062017");
		Employee em2 = new Employee("101", "02062017");
		Employee em3 = new Employee("102", "02062017");
		Employee em4 = new Employee("103", "02062017");
		return empMap;
	}
	
}