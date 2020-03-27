package com.prep.projectEuler;

/*
 *The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 55^2 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
public class Problem_5_SumSquareDifference {

	public static void main(String[] args) {
		int squareOfSum = (100*101)/2;
		squareOfSum = squareOfSum*squareOfSum;
		int sumOfSquares = 0;
		for (int i = 1; i <= 100; i++) {
			sumOfSquares = sumOfSquares + (i*i);
		}
		System.out.println(squareOfSum + " - " + sumOfSquares + " = " + (squareOfSum - sumOfSquares));
	}

}
