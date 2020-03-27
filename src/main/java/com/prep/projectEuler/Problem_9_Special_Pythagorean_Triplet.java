package com.prep.projectEuler;

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/
public class Problem_9_Special_Pythagorean_Triplet {

	public static void main(String[] args) {
		int c=0;
		int sum = 1000;
		for(int a=1 ; a<=sum/2; a++) {
			for(int b=a; b<sum; b++) {
				c = sum-b-a;
				if((a*a + b*b)==c*c) {
					System.out.println(a + "*" + b + "*" + c + "=" + a*b*c);
					return;
				}
			}
		}
	}
}
