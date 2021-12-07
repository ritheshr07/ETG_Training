package com.sonata.shape;

public class Square extends Shape{
	public Square(double length) {
	
		super(length);
	}
	
	public double calArea() {
		double area =this.length *this.length;
		return area;
	}
	public static void main(String[] args) {
		Square s = new Square(5);
		System.out.println("Area of Square : "+s.calArea());
	}
}
