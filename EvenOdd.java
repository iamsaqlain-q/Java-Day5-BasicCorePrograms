package com.java.review1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		System.out.println("Enter num : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 2 == 0)
			System.out.println(+ num + " is even");
		else
			System.out.println(+ num + " is odd");
	}
}
