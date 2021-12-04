package com.sonata;

public class Truck extends Car {
int weight;

public Truck(int a,double b, String c){
	super(a,b,c);
}
	public double getSalePrice() {
		double price;
		if(weight>2000) {
			 price = regularPrice - (regularPrice*0.1);
		}
		else {
			 price = regularPrice - (regularPrice*0.2);
		}
		return price;
	}
public void display() {
	System.out.println("Truck : ");
	System.out.println("weight : " + weight);
	System.out.println("speed : " + speed);
	System.out.println("color : " + color);
	System.out.println("original Price : " + regularPrice);
	System.out.println("SalePrice : " + getSalePrice());
	System.out.println();
}
public static void main(String arg[]) {
	
}
}
