package com.prep.sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] unsortedArr = {12,2,54,78,23,37,21,3,23};
		bubbleSort(unsortedArr);
		System.out.println(Arrays.toString(unsortedArr));
	}

	private static void bubbleSort(int[] unsortedArr) {
		boolean swapFlag = false;
		for (int i = 0; i < unsortedArr.length; i++) {
			for (int j = 0; j < unsortedArr.length-i-1; j++) {
				if(unsortedArr[j]>unsortedArr[j+1]) {
					int temp = unsortedArr[j];
					unsortedArr[j] = unsortedArr[j+1];
					unsortedArr[j+1] = temp;
					swapFlag = true;
				}
			}
			if(!swapFlag)
				break;
			
			swapFlag=false;
		}
	}
}
