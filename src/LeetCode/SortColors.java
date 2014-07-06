package LeetCode;

public class SortColors {

	public static void main(String[] args) {
		SortColors sc = new SortColors();
		int[] input = { 1 };
		sc.sortColors(input);

	}

	public void sortColors(int[] A) {

		int point1 = 0, move = 0, point2 = A.length - 1;

		while (move <= point2) {

			if (A[move] == 0) {
				int tmp = A[point1];
				A[point1] = A[move];
				A[move] = tmp;
				move++;
				point1++;
			} else if (A[move] == 1) {
				move++;
			} else if (A[move] == 2) {
				int tmp = A[point2];
				A[point2] = A[move];
				A[move] = tmp;
				point2--;
			}
		}

	}

}
