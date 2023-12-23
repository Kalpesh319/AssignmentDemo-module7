package com.Assignment;

public class SumofArray {
	public static void main(String[] args) {
		int [] a = new int [] {1, 2, 3, 4, 5};  
        int sum = 0;  
        for (int i = 0; i < a.length; i++) {  
           sum = sum + a[i];
        }  
        System.out.println("Sum of all the elements of an array: " + sum);
	}
	}


