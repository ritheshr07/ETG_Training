package com.sonata;

public class Tester extends Employee {
	
	public Tester(int i, String j, double k) {
		super(i,j,k);
	}
	
	public double salCal(double HRA,double DA) {
		double total = super.salCal(HRA, DA) + 2000;
		return total;
	}
	public static void main(String[] args) {
		Tester t1 = new Tester(123, "Test", 30000);
		t1.display();
		System.out.println("Total Salary : " + t1.salCal(200, 300));
	}
}
