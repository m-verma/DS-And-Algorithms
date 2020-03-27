package com.prep.projectEuler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CellCompete {

	public static void main(String... args) throws IOException {
		System.out.println(cellCompete(new int[] { 1, 0, 0, 0, 0, 1, 0, 0 }, 2));
	}

	public static List<Integer> cellCompete(int[] states, int days) {
		List<Integer> result;
		if (days == 0) {
			return IntStream.of(states).boxed().collect(Collectors.toList());
		}

		// assuming : 0 = inactive; 1 = active
		int lneighbour = 0;
		int rneighbour = 0;
		result = new ArrayList<>();
		for (int j = 0; j < days; j++) {
			if (!result.isEmpty()) {
				states = result.stream().mapToInt(state -> state).toArray();
				result = new ArrayList<>();
			}
			for (int i = 0; i < states.length; i++) {

				if (i == 0) {
					lneighbour = 0;
				} else {
					lneighbour = states[i - 1];
				}

				if (i < states.length - 1) {
					rneighbour = states[i + 1];
				} else {
					rneighbour = 0;
				}

				result.add(lneighbour ^ rneighbour);
			}

		}

		return result;
	}
}
