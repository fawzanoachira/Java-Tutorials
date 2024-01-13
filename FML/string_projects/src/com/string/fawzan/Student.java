package com.string.fawzan;

public class Student {
	private int studentid;
	private String studentName;
	private double studentMarks;
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(double studentMarks) {
		this.studentMarks = studentMarks;
	}
	public Student(int studentid, String studentName, double studentMarks) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}
	
	
}
