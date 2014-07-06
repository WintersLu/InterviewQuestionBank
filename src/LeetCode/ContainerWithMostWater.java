package LeetCode;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxArea(int[] height) {

		if (height.length < 2)
			return 0;
		int start = 0;
		int end = height.length - 1;
		int max = 0;
		while (start < end) {
			max = Math.max(max,
					(end - start) * Math.min(height[start], height[end]));
			if (height[start] < height[end])
				start++;
			else
				end--;
		}
		return max;
	}

}
