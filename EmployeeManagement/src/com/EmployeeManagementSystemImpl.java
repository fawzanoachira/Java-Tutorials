package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import exception.EmployeeNotFoundException;
import exception.InvalidChoiceException;
import sorting.SortEmployeeByAge;
import sorting.SortEmployeeById;
import sorting.SortEmployeeByName;
import sorting.SortEmployeeBySalary;

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
		System.out.println("EMPLOYEE DETAILS AS FOLLOWS");
		System.out.println("---------------------------");
		if(!db.isEmpty()) {
			Set<String> key = db.keySet();
			for(String keys:key) {
				System.out.println(db.get(keys));
			}
		}
		else {
			String message = "EMPLOYEE DETAILS ARE EMPTY";
			try {
				throw new EmployeeNotFoundException(message);
			}
			catch(EmployeeNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void removeEmployee() {
		System.out.println("ENTER THE ID OF THE EMPLOYEE TO BE REMOVED");
		String id = sc.next();
		id = id.toUpperCase();
		if(db.containsKey(id)) {
			Employee employee = db.remove(id);
			System.out.println("SUCCESSFULLY REMOVED EMPLOYEE WITH ID"+id);
		}
		else {
			String message="NO RECORD FOR PROVIDED ID";
			try {
				throw new EmployeeNotFoundException(message);
			}
			catch(EmployeeNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void removeAllEmployee() {
		System.out.println("TOTAL RECORDS ARE "+db.size());
		System.out.println("REMOVING ALL EMPLOYEES");
		if(!db.isEmpty()) {
			db.clear();
			System.out.println("ALL RECORDS REMOVED");
		}
		else {
			String message = "NO RECORDS OF EMPLOYEES";
			try {
				throw new EmployeeNotFoundException(message);
			}
			catch(EmployeeNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void updateEmployee() {
		System.out.println("ENTER THE ID OF THE EMPLOYEE TO BE UPDATED: ");
		String id = sc.next();
		id = id.toUpperCase();
		if(db.containsKey(id)) {
			Employee employee = db.get(id);
			System.out.println("1. UPDATE NAME\n2. UPDATE AGE\n3. UPDATE SALARY");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: 
				System.out.println("ENTER THE NAME");
				String name = sc.next();
				employee.setEmpName(name);
				System.out.println("EMPLOYEE NAME UPDATE AS "+employee.getEmpName());
				break;
			case 2:
				System.out.println("ENTER THE AGE");
				int age = sc.nextInt();
				employee.setEmpAge(age);
				System.out.println("EMPLOYEE AGE UPDATE AS "+employee.getEmpAge());
				break;
			case 3:
				System.out.println("ENTER THE SALARY");
				double salary = sc.nextDouble();
				employee.setEmpSalary(salary);
				System.out.println("EMPLOYEE SALARY UPDATE AS "+employee.getEmpSalary());
				break;
			default:
				String message = "INVALID CHOICE RE-ENTER VALID CHOICE";
				try {
					throw new InvalidChoiceException(message);
				}
				catch(InvalidChoiceException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

	@Override
	public void countEmployee() {
		System.out.println("TOTAL COUNT EMPLOYEES ARE "+db.size());
	}

	@Override
	public void sortEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		Set<String> keySet = db.keySet();
		for(String key:keySet) {
			Employee employee = db.get(key);
			list.add(employee);
		}
		System.out.println("1. SORT EMPLOYEE USING ID\n2. SORT EMPLOYEE USING NAME");
		System.out.println("3. SORT EMPLOYEE USING AGE\n4. SORT EMPLOYEE USING SALARY");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			Collections.sort(list, new SortEmployeeById());
			for(Employee i:list) {
				System.out.println(i);
			}
			break;
		case 2:
			Collections.sort(list, new SortEmployeeByName());
			for(Employee i:list) {
				System.out.println(i);
			}
			break;
		case 3:
			Collections.sort(list, new SortEmployeeByAge());
			for(Employee i:list) {
				System.out.println(i);
			}
			break;
		case 4:
			Collections.sort(list, new SortEmployeeBySalary());
			for(Employee i:list) {
				System.out.println(i);
			}
			break;
		default:
			String message = "INVALID CHOICE ENTER VALID CHOICE";
			try {
				throw new InvalidChoiceException(message);
			}
			catch (InvalidChoiceException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void employeeWithHighestSalary() {
		List<Employee> list = new ArrayList<Employee>();
		Set<String> keySet = db.keySet();
		for(String key:keySet) {
			Employee employee = db.get(key);
			list.add(employee);
		}
		Collections.sort(list, new SortEmployeeBySalary());
		System.out.println("EMPLOYEE WITH HIGHEST SALARY IS: "+list.get(list.size()-1));
	}

	@Override
	public void employeeWithLowestSalary() {
		List<Employee> list = new ArrayList<Employee>();
		Set<String> keySet = db.keySet();
		for(String key:keySet) {
			Employee employee = db.get(key);
			list.add(employee);
		}
		Collections.sort(list, new SortEmployeeBySalary());
		System.out.println("EMPLOYEE WITH LOWEST SALARY IS: "+list.get(0));
	}

}
