package LeetCode;

import java.util.HashMap;

public class MinimumWindowSubstring {

	public static void main(String[] args) {
		MinimumWindowSubstring m = new MinimumWindowSubstring();
		m.minWindow("ADOBECODEBANC", "ABC");
	}

	public String minWindow(String S, String T) {
		String result = "";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		if (S == null || T == null)
			return result;

		for (int i = 0; i < T.length(); i++) {
			if (map.containsKey(T.charAt(i))) {
				map.put(T.charAt(i), map.get(T.charAt(i)) + 1);
			} else
				map.put(T.charAt(i), 1);
		}

		int minSize = Integer.MAX_VALUE;
		int count = 0;
		int left = 0;
		for (int i = 0; i < S.length(); i++) {
			if (map.containsKey(S.charAt(i))) {
				map.put(S.charAt(i), map.get(S.charAt(i))-1);
				if(map.get(S.charAt(i)) >= 0){
					count++;
				}
				while(count == T.length()){
					if(map.containsKey(S.charAt(left))){
						map.put(S.charAt(left), map.get(S.charAt(left))+1);
						if(map.get(S.charAt(left))>0){
							if(minSize > i-left+1){
								minSize = i-left+1;
								result = S.substring(left, i+1);
							}
							count--;
						}
					}
					left++;
				}
			}
		}
		return result;
	}

}
