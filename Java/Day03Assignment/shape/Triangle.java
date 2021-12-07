package com.sonata.shape;

public class Triangle extends Shape{
public Triangle(double len,double hei,double wid) {
		
		super(len,hei,wid);
	}
	
	public double calArea() {
		double area =(this.height*this.width)/2;
		return area;
	}
	public static void main(String[] args) {
		Triangle t = new Triangle(9,3,4);
		System.out.println("Area of Triangle : "+t.calArea());
	}
}
