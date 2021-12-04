package com.sonata;
public class Student {
	int stdID;
	String stdName;
	String stdClass;
	Student(int id, String name,String clas){
		this.stdID = id;
		this.stdName= name;
		this.stdClass=clas;
		}
	Student(){}
	public void Display() {
		System.out.println(stdID);
		System.out.println(stdName);
		System.out.println(stdClass);
		System.out.println();
	}
	public static void main(String[] args) {
		Student s1=new Student(123,"Rohan","SSLC");
		System.out.println("Student1 Details :");
		s1.Display();
		Student s2=new Student(124,"Ramesh","PUC");
		System.out.println("Student2 Details :");
		s2.Display();
		
	}

}
