package com.sonata;

public class Product {
	
	int ProID;
	String ProName;
	double ProPrice;
	Product(int id, String name, double price){
		this.ProID = id;
		this.ProName= name;
		this.ProPrice=price;
		}
	Product(){}
	public double totalPrice(double gst) {
		double total=this.ProPrice+(this.ProPrice*gst/100);
				return total;
	}
	
	public void display() {
		
		System.out.println(ProID);
		System.out.println(ProName);
		System.out.println(ProPrice);
	}
	public static void main(String arg[]) {
		Product p1=new Product(123,"Mobile",8000);
		p1.display();
		System.out.println("Total Price Including GST: "+p1.totalPrice(2));
		
	}

}
