package Linkedin;

public class IsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(IsNumber.isNumeric("123"));
		System.out.println(IsNumber.isNumeric("+123.0"));
		System.out.println(IsNumber.isNumeric("-123.0"));
		System.out.println(IsNumber.isNumeric("123."));
		System.out.println(IsNumber.isNumeric("123.03.2"));
		System.out.println(IsNumber.isNumeric("+123"));
		System.out.println(IsNumber.isNumeric("12asd"));
		System.out.println(IsNumber.isNumeric(".13"));
		System.out.println(IsNumber.isNumeric("+."));
	}
	
	
	public static boolean isNumeric(String str)
	{
//	  return str.matches("(-?|\\+?)\\d+(\\.\\d+)?");
	  return str.matches("(-?|\\+?)\\d+(\\.)?(\\d+)?");
	}
	
	
	public static boolean isNumber(String s){
		s = s.trim();
		if(s.length() == 0) return false;
		boolean hasDot = false;
		boolean preNum = false;
		for(int i=0; i<s.length(); i++){
			if(i==0 && (s.charAt(0) == '+' || s.charAt(0) == '-'))
				continue;
			char c = s.charAt(i);
			if(c == '.'){
				if(hasDot) return false;
				hasDot = true;
				if(!preNum) return false;
//				preNum = false;
			}else if(c >= '0' && c <= '9'){
				preNum = true;
			}else 
				return false;
		}
//		if(!preNum) return false;
		return true;
	}
	
	
//	public static boolean isNumber(String s) {
//		s = s.trim();
//		if(s.length() == 0) return false;
//		boolean hasDot = false, hasE = false, preNum = false, preE = false, validFrac = true, validExpo = true;
//		
//		for(int i=0; i<s.length(); i++){
//			if(i==0 && (s.charAt(0) == '+' || s.charAt(0) == '-'))
//				continue;
//			char c = s.charAt(i);
//			if(c == '+' || c == '-'){
//				if(!preE) return false;
//				preE = true;
//				preNum = false;
//			}
//			else if(c == 'e' || c == 'E'){
//				if(hasE || !preNum) return false;
//				hasE = true;
//				preNum = false;
//				preE = true;
//				validExpo = false;
//			}else if(c == '.'){
//				if(hasDot || hasE) return false;
//				hasDot = true;
//				if(!preNum) validFrac = false;
//			}else if(c >= '0' && c <= '9'){
//				preNum = true;
//				preE = false;
//				validFrac = true;
//				validExpo = true;
//			}else {
//				return false;
//			}
//				
//		}
//		if(!preNum || !validFrac || !validExpo) return false;
//		return true;
//	}
	
	
	public static boolean isNumeric2(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}

}
