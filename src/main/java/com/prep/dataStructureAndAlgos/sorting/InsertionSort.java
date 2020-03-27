package com.prep.dataStructureAndAlgos.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] unsortedArr = { 12, 2, 54, 78, 23, 37, 21, 3, 23 };
		insertionSort(unsortedArr);
		System.out.println(Arrays.toString(unsortedArr));
	}

	private static void insertionSort(int[] unsortedArr) {
		for (int i = 1; i < unsortedArr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (unsortedArr[j] > unsortedArr[i]) {
					int temp = unsortedArr[i];
					for (int k = i; k > j; k--) unsortedArr[i] = unsortedArr[i - 1];
					unsortedArr[j] = temp;
				}
			}
		}
	}
}
