package com.prep.projectEuler;

public class NumOfWaysToDecode {

	public static void main(String[] args) {
		System.out.println(numWaysToDecode("12315", new int[6]));
	}
	public static int numWaysToDecode(String encodedData, int[] memo){
		int numWays = 0;
		
		if(encodedData==null) return 0;
		
		if(encodedData.isEmpty()) return 1;
		
		if(encodedData.length()==1) return 1;
		
		if(memo[encodedData.length()]!=0) return memo[encodedData.length()];
		
		numWays = numWaysToDecode(encodedData.substring(1), memo);
		if (Integer.valueOf(encodedData.substring(0, 2))>=1 && Integer.valueOf(encodedData.substring(0, 2)) <=26) {
			numWays += numWaysToDecode(encodedData.substring(2), memo);
		}
		memo[encodedData.length()] = numWays;
		
		return numWays;
	}
}
