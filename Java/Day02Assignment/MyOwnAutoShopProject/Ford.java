package com.sonata;

public class Ford extends Car{
	int year;
	int manufacturerDiscount;
	public Ford(int a,double b, String c){
		super(a,b,c);
	}
	public double getSalePrice() {
		double price;

		price= regularPrice- manufacturerDiscount;
		return price;
		
	}
	public void display() {
		System.out.println("Ford : ");
		System.out.println("year : " + year);
		System.out.println("speed : " + speed);
		System.out.println("color : " + color);
		System.out.println("original Price : " + regularPrice);
		System.out.println("SalePrice : " + getSalePrice());
		System.out.println();
	}
	
	public static void main(String[] args) {
		

	}

}
