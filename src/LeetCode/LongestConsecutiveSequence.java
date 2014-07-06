package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] input = {-1, 1, 0};
		LongestConsecutiveSequence l = new LongestConsecutiveSequence();
		l.longestConsecutive(input);

	}

	public int longestConsecutive(int[] num) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < num.length; i++) {
			if (map.containsKey(num[i]))
				continue;

			map.put(num[i], 1);
			if (map.containsKey(num[i] + 1) && map.containsKey(num[i] - 1)) {
				int longest = map.get(num[i] + 1) + map.get(num[i] - 1) + 1;
				map.put(num[i] + map.get(num[i] + 1), longest);
				map.put(num[i] - map.get(num[i] - 1), longest);
			} else if (map.containsKey(num[i] + 1)) {
				map.put(num[i], map.get(num[i] + 1) + 1);
				map.put(num[i] + map.get(num[i] + 1), map.get(num[i] + 1) + 1);
			} else if (map.containsKey(num[i] - 1)) {
				map.put(num[i], map.get(num[i] - 1) + 1);
				map.put(num[i] - map.get(num[i] - 1), map.get(num[i] - 1) + 1);
			}
		}

		int max = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > max)
				max = entry.getValue();
		}
		return max;
	}

}
