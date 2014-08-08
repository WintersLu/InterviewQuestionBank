package LeetCode;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] input = { 3, 2, 4 };
		TwoSum t = new TwoSum();
		t.twoSum(input, 6);
	}

	public int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < numbers.length; i++) {

			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				result[0] = index + 1;
				result[1] = i + 1;
			} else
				map.put(target - numbers[i], i);

		}
		return result;
	}

}
