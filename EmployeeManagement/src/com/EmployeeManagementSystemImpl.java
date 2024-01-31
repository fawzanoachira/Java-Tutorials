package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import exception.EmployeeNotFoundException;

public class EmployeeManagementSystemImpl implements EmployeeManagementSystem{
	Scanner sc = new Scanner(System.in);
	Map<String, Employee> db = new LinkedHashMap<String, Employee>();

	@Override
	public void addEmployee() {
		System.out.println("ENTER THE NAME OF EMPLOYEE: ");
		String name = sc.next();
		System.out.println("ENTER THE AGE OF THE EMPLOYEE: ");
		int age = sc.nextInt();
		System.out.println("ENTER THE SALARY OF THE EMPLOYEE: ");
		double salary = sc.nextDouble();
		Employee emp = new Employee(name, age, salary);
		db.put(emp.getEmpId(), emp);
		System.out.println("EMPLOYEE ADDED SUCCESSFULLY");
		System.out.println(emp.getEmpId());
	}

	@Override
	public void displayEmployee() {
		System.out.println("ENTER THE ID OF THE EMPLOYEE TO DISPLAY: ");
		String id = sc.next();
		id = id.toUpperCase();
		if(db.containsKey(id)) {
			Employee employee = db.get(id);
			System.out.println("EMPLOYEE ID: "+employee.getEmpId());
			System.out.println("EMPLOYEE NAME: "+employee.getEmpName());
			System.out.println("EMPLOYEE AGE: "+employee.getEmpAge());
			System.out.println("EMPLOYEE SALARY: "+employee.getEmpSalary());
		}
		else {
			String message = "!!!-----EMPLOYEE NOT FOUND-----!!!";
			try {
				throw new EmployeeNotFoundException(message);
			}
			catch(EmployeeNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void displayAllEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAllEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void countEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void employeeWithHighestSalary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void employeeWithLowestSalary() {
		// TODO Auto-generated method stub
		
	}

}
