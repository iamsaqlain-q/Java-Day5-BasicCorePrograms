package com.java.review1;

import java.util.Scanner;

public class ConsonantAndVowel {

	public static void main(String[] args) {
		
		System.out.println("Enter alphabet : ");
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		
		if(a == 'a' || a == 'e' ||  a == 'i' ||  a == 'o' ||  a == 'u')
			System.out.println("Alphabet is vowel");
		else
			System.out.println("Alphabet is consonant");
	}
}
