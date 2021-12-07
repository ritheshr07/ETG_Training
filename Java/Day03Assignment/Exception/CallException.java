package com.sonata.Exception;

public class CallException {
	public static void main(String[] args) throws MyException {
		double empSal = 1000000;
		if(empSal<100000) {
			throw new MyException("Your Anual Salary less than 1Lakh.");
		}
		else {
			System.out.println("Welcome to Sonata.");
		}
	}
}
