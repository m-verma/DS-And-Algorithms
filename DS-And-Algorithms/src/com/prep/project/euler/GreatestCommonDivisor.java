package com.prep.project.euler;

public class GreatestCommonDivisor {

	public int generalizedGCD(int num, int[] arr) {
		if (num <= 1 || arr == null || arr.length < 1) {
			return 1;
		}

		int hcf = 1;
		boolean isHcf = false;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if ((arr[j] % arr[i]) != 0) {
					isHcf = false;
					break;
				} else {
					isHcf = true;
				}
			}

			if (isHcf && arr[i] > hcf) {
				hcf = arr[i];
			}

		}

		return hcf;
	}
}
