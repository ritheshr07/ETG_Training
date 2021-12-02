package com.sonata;

public class Large2Number {

	public static void main(String[] args) {
		 int num[] = {1,2,3,4,5};
		 int Large1 = 0;
	        int Large2 = 0;
	        for(int i=0; i<num.length; i++){
	            if(Large1 < num[i]){
	                Large2 = Large1;
	                Large1 =num[i];
	            } 
	            else if(Large2 <num[i]){
	            	Large2 = num[i];
	            }
	        }
	        System.out.println("First Large Number: "+Large1);
	        System.out.println("Second Large Number: "+Large2);

	}

}
