package LeetCode;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		LongestPalindromicSubstring l = new LongestPalindromicSubstring();
		l.longestPalindrome("bb");

	}

	public String longestPalindrome(String s) {
		String result = "";
		for(int i=0; i<s.length(); i++){
			String tmp = finder(s, i, i);
			if(tmp.length() > result.length()){
				result = tmp;
			}
			tmp = finder(s, i, i+1);
			if(tmp.length() > result.length()){
				result = tmp;
			}
		}
		return result;
	}
	
	
	public String finder(String s, int begin, int end){
		while(begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)){
			begin--;
			end++;
		}
		return s.substring(begin+1, end);
	}

}
