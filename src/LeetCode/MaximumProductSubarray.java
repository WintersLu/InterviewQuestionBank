package LeetCode;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProduct(int[] A) {

		int max_ending = 1, min_ending = 1;
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < A.length; i++) {
			int tmp = Math.max(max_ending, 1);
			if (A[i] > 0) {
				max_ending = tmp * A[i];
				min_ending *= A[i];
			} else {
				max_ending = min_ending * A[i];
				min_ending = tmp * A[i];
			}
			result = Math.max(result, max_ending);
		}
		return result;
	}

}
