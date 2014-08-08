package LeetCode;

import java.util.Arrays;

public class _3SumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int threeSumClosest(int[] num, int target) {

		Arrays.sort(num);
		int result = num[0] + num[1] + num[2] - target;
		for (int i = 0; i < num.length - 2; i++) {
			int j = i + 1;
			int k = num.length - 1;

			while (j < k) {
				int diff = num[i] + num[j] + num[k] - target;
				if (diff == 0)
					return target;
				if (Math.abs(diff) < Math.abs(result))
					result = diff;
				if (diff < 0)
					j++;
				else
					k--;
			}
		}
		return result + target;
	}

}
