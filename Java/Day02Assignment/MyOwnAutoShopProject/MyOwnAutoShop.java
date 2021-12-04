package com.sonata;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Sedan s = new Sedan(80, 560000, "Race Red");
		s.length = 15;
		s.display();
		
		Ford f1 = new Ford(90, 880000, "MoonDust Silver");
		f1.year = 2021;	
		f1.manufacturerDiscount=10000;
		f1.display();
		
		Ford f2 = new Ford(90, 890000, "Dimond White");
		f2.year = 2020;
		f2.manufacturerDiscount=20000;
		f2.display();
		
		Truck t = new Truck(100, 1000000, "Absolute Black");
		t.weight = 2800;
		t.display();
		
		Car c = new Car(120, 500000, "Absolute White");
		c.display();

	}

}
