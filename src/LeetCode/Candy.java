package LeetCode;

import java.util.Arrays;

public class Candy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int candy(int[] ratings) {

		int[] nums = new int[ratings.length];
		Arrays.fill(nums, 1);
		for (int i = 1; i < ratings.length; i++) {
			if (ratings[i] > ratings[i - 1]) {
				nums[i] = nums[i - 1] + 1;
			} else
				nums[i] = 1;
		}

		for (int i = ratings.length - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1]) {
				nums[i] = Math.max(nums[i], nums[i + 1] + 1);
			} else
				nums[i] = Math.max(nums[i], 1);
		}

		int result = 0;
		for (int i = 0; i < ratings.length; i++) {
			result += nums[i];
		}
		return result;
	}

}
