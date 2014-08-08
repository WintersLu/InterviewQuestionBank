package LeetCode;

public class ValidNumber {

	public static void main(String[] args) {
		ValidNumber v = new ValidNumber();
		v.isNumber("-1.");

	}

	public boolean isNumber(String s) {
		s = s.trim();
		if(s.length() == 0) return false;
		boolean hasDot = false, hasE = false, preNum = false, preE = false, validFrac = true, validExpo = true;
		
		for(int i=0; i<s.length(); i++){
			if(i==0 && (s.charAt(0) == '+' || s.charAt(0) == '-'))
				continue;
			char c = s.charAt(i);
			if(c == '+' || c == '-'){
				if(!preE) return false;
				preE = true;
				preNum = false;
			}
			else if(c == 'e' || c == 'E'){
				if(hasE || !preNum) return false;
				hasE = true;
				preNum = false;
				preE = true;
				validExpo = false;
			}else if(c == '.'){
				if(hasDot || hasE) return false;
				hasDot = true;
				if(!preNum) validFrac = false;
			}else if(c >= '0' && c <= '9'){
				preNum = true;
				preE = false;
				validFrac = true;
				validExpo = true;
			}else {
				return false;
			}
				
		}
		if(!preNum || !validFrac || !validExpo) return false;
		return true;
	}

}
