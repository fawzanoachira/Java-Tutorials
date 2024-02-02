package com;

public class Employee {
	private String empId;
	private String empName;
	private int empAge;
	private double empSalary;
	private static int count=1001;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
				+ "]";
	}
	public Employee(String empName, int empAge, double empSalary) {
		super();
		this.empId = "MFA"+count;
		count++;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}
	
	
}
