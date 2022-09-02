package com.java.review1;

import java.util.Scanner;

public class PowerOfTwo {
	
public static void main(String[] args) {
		
		int exponent = 0;
		int i = 0;
		
		System.out.print("Enter the value of the Exponent : ");
	    Scanner sc = new Scanner(System.in);
		exponent = sc.nextInt();
		
		if (exponent >= 0) {
			if (exponent < 31) {
				System.out.println("\nDisplaying Powers of 2...\n");
				for (i=0; i <= exponent; i++) 
					System.out.println("2^"+ i +" = "+ (int)(Math.pow(2, i)));
			}
			else
				System.out.println("\nInteger overflow error.\nKindly enter an exponential value less than 31");		
		}
		else
			System.out.println("\nEnter a positive exponent value");
	}

}
