package com.testJan11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Stream;
public class EmployeePresentOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		List<Employee> employeeList=new ArrayList<>();
		employeeList.addAll(Employee.arrayList());
		if(employeeList.stream().filter(e->e.getName().equalsIgnoreCase(name)) != null)
		{
			System.out.println("Excisting");
		}
		else
		{
			System.out.println("Not Excisting");
		}
	}
}
