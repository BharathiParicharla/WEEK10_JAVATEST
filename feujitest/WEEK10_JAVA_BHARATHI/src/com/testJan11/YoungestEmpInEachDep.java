package com.testJan11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class YoungestEmpInEachDep {
	public static void main(String[] args) {
		List<Employee> employeeList=new ArrayList();
		employeeList.addAll(Employee.arrayList());
		Map<String, Optional<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors
			.reducing(BinaryOperator.minBy(Comparator.comparing(Employee::getAge)))
				));
		map.entrySet().forEach(e->
		System.out.println(e.getKey()+" "+e.getValue().get()));
		
	}
}
