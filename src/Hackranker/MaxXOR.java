package Hackranker;

public class MaxXOR {

	public static void main(String[] args) {
		int result =  maxXor(1, 10);
	}

	static int maxXor(int l, int r) {

		int result = 0;
		for (int i = l; i <= r; i++) {
			for (int j = i; j <= r; j++) {
				int tmp = i ^ j;
				result = Math.max(result, tmp);
			}
		}
		return result;

	}

}
