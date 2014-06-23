package LeetCode;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void merge(int A[], int m, int B[], int n) {

		while (m > 0 && n > 0) {
			int val;
			if (A[m - 1] >= B[n - 1]) {
				val = A[m - 1];
				A[m + n - 1] = val;
				m--;
			} else {
				val = B[n - 1];
				A[m + n - 1] = val;
				n--;
			}
		}
		if (m == 0) {
			while (n > 0) {
				A[m + n - 1] = B[n - 1];
				n--;
			}
		}

	}

}
