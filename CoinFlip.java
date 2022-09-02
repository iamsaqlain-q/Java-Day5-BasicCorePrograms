package com.java.review1;
import java.util.Scanner;

public class CoinFlip {
	
		public static void main(String[] args) {
			
			int heads = 0;
			int tails = 0;
			double percentHeads = 0;
			double percentTails = 0;
			int n = 0;
			int i = 0;
			double flip = 0;
			
			System.out.print("\nEnter the number of flips of your choice : ");
		    Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			
			if (n <= 0)
				System.out.println("\nEnter a positive number...Please try again!");
			else {
				
				for(i=0; i < n; i++) {

					flip = Math.random();
					if (flip < 0.5) {
						tails++;
						System.out.println("TAIL");
					}
					else {
						heads++;
						System.out.println("HEAD");
					}
					System.out.print(flip);
				}
				System.out.println();
				System.out.println("HEAD "+ heads +" times.");
				System.out.println("TAIL "+ tails +" times.");
				percentHeads = (heads*100)/n;
				percentTails = (tails*100)/n;
				System.out.println("HEADS : " + percentHeads + "%" );
				System.out.println("TAILS : " + percentTails + "%" );
			}
		
		}

	}
