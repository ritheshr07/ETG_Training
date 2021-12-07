package com.sonata;

public class Developer  extends Employee {
	public Developer(int i, String j, double k) {
		super(i,j,k);
	}
	
	public double salCal(double HRA,double DA) {
		double total = super.salCal(HRA, DA) + 3500;
		return total;
	}
	public static void main(String[] args) {
		Developer d1 = new Developer(126, "Develop", 35000);
		d1.display();
		System.out.println("Total Salary : " + d1.salCal(400, 500));
	}
}
