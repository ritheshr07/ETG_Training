package com.sonata;

public class DuplicateValues {
	public static void main(String[] args) {
        int a[] ={1, 2, 3, 4, 4, 6, 6, 7, 8, 9};   
        
        System.out.println("Duplicate Values in  array: ");    
        for(int i = 0; i < a.length; i++) {  
            for(int j = i + 1; j < a.length; j++) {  
                if(a[i] == a[j])  
                    System.out.println(a[j]);  
            }  
        } 
}
}

