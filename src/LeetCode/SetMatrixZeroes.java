package LeetCode;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void setZeroes(int[][] matrix) {
		boolean col = false;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				col = true;
				break;
			}
		}
		boolean row = false;
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				row = true;
				break;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int l = 0; l < matrix[0].length; l++) {
				if (matrix[i][l] == 0) {
					matrix[i][0] = 0;
					matrix[0][l] = 0;
				}
			}
		}
		for (int m = 1; m < matrix.length; m++) {
			if (matrix[m][0] == 0)
				for (int n = 0; n < matrix[0].length; n++)
					matrix[m][n] = 0;
		}
		for (int n = 1; n < matrix[0].length; n++) {
			if (matrix[0][n] == 0)
				for (int m = 0; m < matrix.length; m++)
					matrix[m][n] = 0;
		}
		if (row) {
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[0][i] = 0;
			}
		}
		if (col) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][0] = 0;
			}
		}

	}

}
