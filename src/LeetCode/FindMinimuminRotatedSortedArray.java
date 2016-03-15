package LeetCode;

public class FindMinimuminRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 4, 5, 6, 7, 0, 1, 2 };
		findMin(num);
	}

	public static int findMin(int[] num) {
		int start = 0, end = num.length - 1;

		while (start < end) {
			int middle = (start + end) / 2;
			if (num[middle] < num[end])
				end = middle;
			else if (num[start] <= num[middle] && num[middle] > num[end])
				start = middle + 1;
			else
				return num[start];
		}
		return num[start];

	}

}
