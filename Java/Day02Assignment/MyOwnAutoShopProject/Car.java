package com.sonata;

public class Car {
	int speed;
	double regularPrice;
	String color;
	public Car(int speed,double price, String color){
		this.speed = speed;
		this.regularPrice= price;
		this.color=color;
		}
	
	public double getSalePrice() {
		double price=regularPrice;
		return price;
	}
	public void display() {
		System.out.println("Car : ");
		System.out.println("speed : " + speed);
		System.out.println("color : " + color);
		System.out.println("SalePrice : " + getSalePrice());
		System.out.println();
	}

}
