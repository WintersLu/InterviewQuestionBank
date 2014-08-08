package LeetCode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length == 0) return prefix;
        
        for(int i=0; i<strs[0].length(); i++){
            char current = strs[0].charAt(i);
            for(int k=1; k<strs.length; k++){
                if(!(i < strs[k].length() && strs[k].charAt(i) == current))
                    return prefix;
            }
            prefix += current;
        }
        return prefix;
    }

}
