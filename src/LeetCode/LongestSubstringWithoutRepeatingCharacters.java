package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
		l.lengthOfLongestSubstring("abcabcbb");

	}

	public int lengthOfLongestSubstring(String s) {
		
		Set<Character> set = new HashSet<Character>();
		int max = 0;
		for(int i=0, start=0; i<s.length(); i++){
			if(!set.contains(s.charAt(i))){
				set.add(s.charAt(i));
			}else{
				while(set.contains(s.charAt(i))){
					set.remove(s.charAt(start));
					start++;
				}
				set.add(s.charAt(i));
			}
			max = Math.max(max, i-start+1);
		}
		return max;
	}

}
