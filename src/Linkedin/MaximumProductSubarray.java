package Linkedin;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int maxSubarrayProduct(int[] arr) {
		// int n = arr.length;
		int max_ending_here = 1;
		int min_ending_here = 1;
		int max_so_far = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				max_ending_here *= arr[i];
				min_ending_here = Math.min(min_ending_here, 1);
			} else if (arr[i] == 0) {
				max_ending_here = 1;
				min_ending_here = 1;
			} else {
				int x = max_ending_here;
				max_ending_here = Math.max(min_ending_here * arr[i], 1);
				min_ending_here = x * arr[i];
			}

			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
		}
		return max_so_far;
	}

}
