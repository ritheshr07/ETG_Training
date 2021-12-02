package com.sonata;

public class ReverseArray {

	public static void main(String[] args) {
		int numbers[] ={1,2,3,4,5};
		System.out.print("Array is: ");
		for( int i=0; i<numbers.length; i++ ){ 
			 System.out.print( numbers[i]+ " " );
			}
		System.out.println();
		System.out.print("Reversed Array is: ");
		for( int i=numbers.length-1; i>=0; i-- ){ 
			 System.out.print( numbers[i]+ " " );
			 }

	}

}
