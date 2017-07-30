package com.sk.learn.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(100, "Shyju", 200.22));
		empList.add(new Employee(104, "Prashanth", 200.23));
		empList.add(new Employee(110, "Sudheesh", 200.24));
		empList.add(new Employee(99, "Naijin", 200.25));
		empList.add(new Employee(50, "Thepp Joy", 200.26));

		System.out.println("Before sort------------------------------------------------");
		empList.forEach(emp -> {
			System.out.println(emp.getEmpNo() + " " + emp.getName() + " " + emp.getSalary());
		});
		System.out.println("Ascending order sort--------------------------------------------------");
		Collections.sort(empList);
		empList.forEach(emp -> {
			System.out.println(emp.getEmpNo() + " " + emp.getName() + " " + emp.getSalary());
		});
		System.out.println("Name sort--------------------------------------------------");
		Collections.sort(empList, new NameComparator());
		empList.forEach(emp -> {
			System.out.println(emp.getEmpNo() + " " + emp.getName() + " " + emp.getSalary());
		});

	}
}

class Employee implements Comparable<Object> {
	Integer empNo;
	String name;
	double salary;

	public Employee(Integer empNo, String name, double salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		return this.getEmpNo() - e.getEmpNo();
	}
}

class NameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		String name1 = e1.getName();
		String name2 = e2.getName();
		return name1.compareTo(name2);
	}

}
