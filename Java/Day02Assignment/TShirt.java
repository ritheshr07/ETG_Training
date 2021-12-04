package com.sonata;

public class TShirt {
	String color;
	String material;
	String design;
	TShirt(String col, String mat, String desi){
		this.color = col;
		this.material= mat;
		this.design=desi;
		}
	TShirt(){}
public void display() {
		
		System.out.println("TShirt color: "+color);
		System.out.println("TShirt material: "+material);
		System.out.println("TShirt design: "+design);
		System.out.println();
	}
	public static void main(String[] args) {
		TShirt small=new TShirt("Orange","Silk","Round-Neck");
		small.display();
		TShirt large=new TShirt("Blue","Cotton","Collored");
		large.display();
		TShirt xlarge=new TShirt("Red","Wool","Sports");
		xlarge.display();
		

	}
	
}
