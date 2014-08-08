package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	public static void main(String[] args) {
		PalindromePartitioning p = new PalindromePartitioning();
		p.partition("bb");

	}

	public List<List<String>> partition(String s) {
		List<List<String>> result = new ArrayList<List<String>>();
		List<String> row = new ArrayList<String>();
		return recurPartition(result, row, s);
	}

	public boolean isValidPalindrome(String s) {
		int start = 0, end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}

	public List<List<String>> recurPartition(List<List<String>> result,
			List<String> row, String s) {
		if (s.length() == 1) {
			row.add(s);
			result.add(row);
			return result;
		}
		if (s.length() == 0) {
			result.add(row);
			return result;
		}

		for (int i = 0; i < s.length(); i++) {
			if (isValidPalindrome(s.substring(0, i + 1))) {
				List<String> newRow = new ArrayList<String>(row);
				newRow.add(s.substring(0, i + 1));
				result = recurPartition(result, newRow, s.substring(i+1));
			}
		}
		return result;
	}

}
