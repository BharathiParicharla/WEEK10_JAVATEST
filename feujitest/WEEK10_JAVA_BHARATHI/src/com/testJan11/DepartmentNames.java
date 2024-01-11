package com.testJan11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DepartmentNames {
	public static void main(String[] args) {
		List<Employee> employeeList=new ArrayList<>();
		employeeList.addAll(Employee.arrayList());
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
	}
}
