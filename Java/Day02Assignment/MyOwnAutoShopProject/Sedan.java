package com.sonata;

public class Sedan extends Car {
	int length;
	public Sedan(int a,double b, String c){
		super(a,b,c);
	}
	public double getSalePrice() {
		double price;

		if(length>20) {
			 price = regularPrice - (regularPrice*0.05);
		}
		else {
			 price = regularPrice - (regularPrice*0.1);
		}
		return price;
	}
		public void display() {
			System.out.println("Sedan :");
			System.out.println("length : " + length);
			System.out.println("speed : " + speed);
			System.out.println("color : " + color);
			System.out.println("original Price : " + regularPrice);
			System.out.println("SalePrice : " + getSalePrice());
			System.out.println();
		}	
	
	public static void main(String[] args) {

	}

}
