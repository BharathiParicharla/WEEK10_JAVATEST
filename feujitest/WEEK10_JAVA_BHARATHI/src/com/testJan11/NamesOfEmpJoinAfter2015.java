package com.testJan11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NamesOfEmpJoinAfter2015 {
	public static void main(String[] args) {
		List<Employee> employeeList=new ArrayList();
		employeeList.addAll(Employee.arrayList());
		employeeList.stream().filter(e->e.getYearOfJoining()>2015).forEach(e->
		System.out.println(e.getName()));
		
	}
}
