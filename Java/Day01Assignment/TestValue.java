package com.sonata;

public class TestValue {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int find=3;
		boolean found=false;

	
	for( int i=0; i<a.length; i++ ){ 
		
		if(a[i]==find)
		{
			found=true;
			break;
		 }
		
}	if(found)
	System.out.println(find+" is found");
	else
	System.out.println(find+" is not found");
	}
	
		
}
