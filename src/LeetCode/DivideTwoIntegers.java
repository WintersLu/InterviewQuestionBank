package LeetCode;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		int k = divide(10, 2);
	}
	
	public static int divide(int dividend, int divisor) {
        long p = Math.abs((long)dividend);
        long q = Math.abs((long)divisor);
        
        int ret = 0;
        while (p >= q) {
            int counter = 0;
            while (p >= (q << counter)) {
                counter++;
            }
            ret += 1 << (counter - 1);
            p -= q << (counter - 1);
        }
        
        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0))
            return ret;
        else
            return -ret;
    }

}
