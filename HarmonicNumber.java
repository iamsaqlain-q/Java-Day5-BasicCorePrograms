package com.java.review1;

public class HarmonicNumber {
	
	void harmonic() {
	int num = 5;
	double result = 0.0;
	
	//Formula : h1 = 1/a, h2 = 1/a+d...hn = 1/a+(n*d) 
	while(num > 0)
	{
		result = result + (double)1/num;
		System.out.println("Harmonic Numbers Are : " + result);
		num--;
	}

}
}
