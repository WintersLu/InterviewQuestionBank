package LeetCode;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int trap(int[] A) {

		int[] leftMost = new int[A.length];
		int[] rightMost = new int[A.length];

		for (int i = 0, tmpMax = 0; i < A.length; i++) {
			leftMost[i] = tmpMax;
			if (A[i] > tmpMax)
				tmpMax = A[i];
		}
		for (int i = A.length - 1, tmpMax = 0; i >= 0; i--) {
			rightMost[i] = tmpMax;
			if (A[i] > tmpMax)
				tmpMax = A[i];
		}
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] < Math.min(leftMost[i], rightMost[i])) {
				result += Math.min(leftMost[i], rightMost[i]) - A[i];
			}
		}
		return result;
	}

}
