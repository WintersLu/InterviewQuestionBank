package LeetCode;

public class SearchA2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean searchMatrix(int[][] matrix, int target) {

		int col = matrix[0].length - 1;
		int row = 0;

		while (col >= 0 && row < matrix.length) {
			if (target == matrix[row][col])
				return true;
			if (target > matrix[row][col]) {
				row++;
			} else if (target < matrix[row][col]) {
				col--;
			}
		}
		return false;
	}

}
