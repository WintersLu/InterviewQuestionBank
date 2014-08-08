package LeetCode;

public class ValidPalindrome {

	public static void main(String[] args) {
		ValidPalindrome v = new ValidPalindrome();
		v.isPalindrome("");

	}

	public boolean isPalindrome(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int start = 0, end = s.length()-1;
		while(start < end){
			if(s.charAt(start) != s.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}

}
