package com.prep.project.euler;

/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

	What is the 10 001st prime number?
 */
public class Problem_7_10001stPrime {

	public static void main(String[] args) {
		int prime=1;
		int count=0;
		while(count!=10001) {
			if(isPrime(++prime))
				count++;
		}
		System.out.println(count + " - " + prime);
	}

	private static boolean isPrime(int i) {
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if(i%j==0) return false;
		}
		return true;
	}
}
