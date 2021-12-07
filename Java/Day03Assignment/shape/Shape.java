package com.sonata.shape;

public class Shape {
	double length;
	double height;
	double width;
	 
	
	public Shape(double length) {
		this.length = length;
	}
	public Shape(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public Shape(double length, double height, double width) {
		this.length = length;
		this.height = height;
		this.width = width;
	}
	public double calArea() {
		return 0;
	}
}
