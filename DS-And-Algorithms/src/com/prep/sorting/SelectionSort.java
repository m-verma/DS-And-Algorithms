package com.prep.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] unsortedArr = {12,2,54,78,23,37,21,3,23};
		selectionSort(unsortedArr);
		System.out.println(Arrays.toString(unsortedArr));
	}

	private static void selectionSort(int[] unsortedArr) {
		if (unsortedArr != null && unsortedArr.length>0) {
			for (int i = 0; i < unsortedArr.length; i++) {
				int imin = i;
				for (int j = i + 1; j < unsortedArr.length; j++) {
					if (unsortedArr[imin] > unsortedArr[j])
						imin = j;
				}

				int temp = unsortedArr[i];
				unsortedArr[i] = unsortedArr[imin];
				unsortedArr[imin] = temp;
			} 
		}
	}

}
