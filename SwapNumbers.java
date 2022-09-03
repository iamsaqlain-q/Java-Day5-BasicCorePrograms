package com.java.review1;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		
	System.out.println("Enter num1 : ");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	System.out.println("Enter num2 : ");
	int num2 = sc.nextInt();
	sc.close();
	
	int temp = num1;
	num1 = num2;
	num2 = temp;
	System.out.println("Numbers after swap : num1 : " + num1 + " num2 : " + num2);
	}
}
