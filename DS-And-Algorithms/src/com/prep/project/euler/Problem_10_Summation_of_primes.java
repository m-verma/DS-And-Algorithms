package com.prep.project.euler;

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/
public class Problem_10_Summation_of_primes {

	public static void main(String[] args) {
		int end = 2000000;
		boolean[] sieveArr = new boolean[end+1];
		for (int i=2; i < sieveArr.length; i++) {
			sieveArr[i]=true;
		}
		
		//eliminate all the numbers from 2 to sqrt(end)
		for(int j=2; j*j<end; j++) {
			if(!sieveArr[j]) continue;
			
			for(int k=j*2;k<sieveArr.length;k+=j) {
				sieveArr[k]=false;
			}
		}
		
		long sum = 0;
		for (int i=2; i<sieveArr.length; i++) {
			if(sieveArr[i])
				sum += i;
		}
		System.out.println(sum);
	}

}
