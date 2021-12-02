package com.sonata;

public class CountDupliateValues {

	public static void main(String[] args) {
		int a[] ={1, 2, 3, 4, 4, 6, 6, 7, 8,9,9,9,9}; 
		int count = 0;
		int maxcount = 0;
		for(int i = 0; i<a.length;i++) {
			count = 1;
			for(int j = i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
				if(count>maxcount) {
					maxcount++;
				}
			}
		}
		System.out.println("The highest count of duplicates is " + maxcount);

	}

}
