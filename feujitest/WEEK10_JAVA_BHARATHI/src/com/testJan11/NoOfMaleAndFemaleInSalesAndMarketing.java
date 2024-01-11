package com.testJan11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NoOfMaleAndFemaleInSalesAndMarketing {
	public static void main(String[] args) {
		List<Employee> employeeList=new ArrayList<>();
		employeeList.addAll(Employee.arrayList());
		Map<String, Long> map = employeeList.stream().filter(e->e.getDepartment()=="Sales"||e.getDepartment()=="Marketing")
		.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		map.entrySet().forEach(System.out::println);
	}
}
