package com.prep.projectEuler;

public class SumOfevenFibonacciNumbers {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int temp = 0;
		int sum = 0;
		while(temp<4000000){
			temp =  a + b;
			a=b;
			b=temp;
			
			if(temp%2==0){
				sum = sum + temp;
			}
		}
		System.out.println(sum);
	}
}
