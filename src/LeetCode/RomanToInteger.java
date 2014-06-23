package LeetCode;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int romanToInt(String s) {

		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);
		int result = 0;
		int i;
		for (i = 0; i < s.length() - 1; i++) {
			if (m.get(s.charAt(i)) >= m.get(s.charAt(i + 1)))
				result += m.get(s.charAt(i));
			else
				result -= m.get(s.charAt(i));
		}
		result += m.get(s.charAt(i));
		return result;
	}

}
