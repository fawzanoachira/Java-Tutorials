package com;

import java.util.Scanner;

import exception.InvalidChoiceException;

public class Main {
	public static void main(String[] args) {
		System.out.println("WELCOME TO EMPLOYEE DATABASE");
		System.out.println("----------------------------");
		EmployeeManagementSystemImpl eme = new EmployeeManagementSystemImpl();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("-----------------MENU-----------------------");
			System.out.println("1. ADD EMPLOYEE\n2. DISPLAY AN EMPLOYEE");
			System.out.println("3. DISPLAY ALL EMPLOYEE\n4. REMOVE AN EMPLOYEE");
			System.out.println("5. REMOVE ALL EMPLOYEE\n6. UPDATE AN EMPLOYEE");
			System.out.println("7. COUNT EMPLOYEES\n8. SORT EMPLOYEES");
			System.out.println("9. EMPLOYEE WITH HIGHEST SALARY\n10. EMPLOYEE WITH LOWEST SALARY");
			System.out.print("ENTER YOUR CHOICE: \n");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				eme.addEmployee();
				break;
			case 2:
				eme.displayEmployee();
				break;
			case 3:
				eme.displayAllEmployee();
				break;
			case 4:
				eme.removeEmployee();
				break;
			case 5:
				eme.removeAllEmployee();
				break;
			case 6:
				eme.updateEmployee();
				break;
			case 7:
				eme.countEmployee();
				break;
			case 8:
				eme.sortEmployee();
				break;
			case 9:
				eme.employeeWithHighestSalary();
				break;
			case 10:
				eme.employeeWithLowestSalary();
				break;
			default:
				String msg = "INVALID CHOICE, ENTER A VALID CHOICE";
				try {
					throw new InvalidChoiceException(msg);
				}
				catch(InvalidChoiceException e){
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
