package com.sonata.shape;

public class Rectangle extends Shape {
	public Rectangle(double len,double wid) {
		
		super(len,wid);
	}
	
	public double calArea() {
		double area =this.length*this.width;
		return area;
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5,8);
		System.out.println("Area of Rectangle : "+r.calArea());
	}
}
