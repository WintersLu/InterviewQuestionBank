package LeetCode;

public class Powxn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public double pow(double x, int n) {
		if (n == 0)
			return 1;
		if (n < 0) {
			n = -n;
			x = 1 / x;
		}
		double result = pow(x, n / 2);
		if (n % 2 == 0) {
			return result * result;
		} else {
			return result * result * x;
		}
	}

}
