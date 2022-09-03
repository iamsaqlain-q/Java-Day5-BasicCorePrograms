package com.java.review1;

import java.util.Scanner;

public class QuotientAndRemainder {
	
	public static void main(String[] args) {
			
		System.out.println("Enter dividend : ");
		Scanner sc = new Scanner(System.in);
		int dividend = sc.nextInt();
		System.out.println("Enter divisor : ");
		int divisor = sc.nextInt();
		sc.close();
		
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		
		System.out.println("Quotient is : " + quotient);
		System.out.println("Remainder is : " + remainder);
	}

}
