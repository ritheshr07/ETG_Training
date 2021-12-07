package com.sonata;

public class Manager extends Employee {
	public Manager(int i, String j, double k) {
		super(i,j,k);
	}
	
	public double salCal(double HRA,double DA) {
		double total = super.salCal(HRA, DA) + 4000;
		return total;
	}
	public static void main(String[] args) {
		Manager m1 = new Manager(125, "Manage", 40000);
		m1.display();
		System.out.println("Total Salary : " + m1.salCal(500, 600));
	}
}
