package LeetCode;

public class RegularExpressionMatching {

	public static void main(String[] args) {
		isMatch("aa", "a*");
	}
	
	public static boolean isMatch(String s, String p) {
		if(p.length() == 0)
            return s.length() == 0;
            
        if(p.length() == 1 || p.charAt(1) != '*'){
            if(s.length() != 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'))
                return isMatch(s.substring(1), p.substring(1));
            return false;
        }
        else{
            int i=0;
            while(i<=s.length() && (i==0 || p.charAt(0) == '.' || s.charAt(i-1) == p.charAt(0))){
                if(isMatch(s.substring(i), p.substring(2))){
                    return true;
                }
                i++;
            }
            return false;
        }
	}

}
