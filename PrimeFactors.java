package com.java.review1;

import java.util.Scanner;

public class PrimeFactors {
void prime() {
	int num;
	System.out.println("Enter Number : ");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	
	for(int index = 2; index < num; index++ )
	{
		while(num % index == 0)
		{
			System.out.println(index+ "");
			num = num / index;
		} 
		if(num > 2)
			System.out.println(num);
	}
}
}