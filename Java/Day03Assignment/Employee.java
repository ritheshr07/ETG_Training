package com.sonata;

public class Employee {
	int empId;
	String empName;
	double empSal;

	public Employee(int id,String name,double sal) {
		this.empId = id;
		this.empName = name;
		this.empSal = sal;
	}
	public void display() {
		System.out.println("Employee ID :" + empId);
		System.out.println("Employee Name :" + empName);
		System.out.println("Employee Salary :" + empSal);
	}
	public double salCal(double HRA,double DA) {
		double total = this.empSal + HRA + DA;
		return total;
	}
	public static void main(String[] args) {
		
	}

}
