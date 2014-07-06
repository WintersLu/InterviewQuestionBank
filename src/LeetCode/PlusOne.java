package LeetCode;

import java.util.Stack;

public class PlusOne {

	public static void main(String[] args) {
		int[] input = {1,0};
		PlusOne po = new PlusOne();
		po.plusOne(input);
	}

	public int[] plusOne(int[] digits) {
		if (digits.length == 0)
			return new int[0];
		Stack<Integer> stack = new Stack<Integer>();
		int carry = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			int result = digits[i] + carry;
			if (result == 10) {
				carry = 1;
				stack.push(0);
			} else {
				carry = 0;
				stack.push(result);
			}
		}
		if (carry == 1)
			stack.push(1);
		int[] r = new int[stack.size()];
		for (int i = 0; i < r.length; i++) {
			r[i] = stack.pop();
		}
		return r;
	}

}
