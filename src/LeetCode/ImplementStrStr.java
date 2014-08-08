package LeetCode;

public class ImplementStrStr {

	public static void main(String[] args) {
		ImplementStrStr i = new ImplementStrStr();
		i.strStr("aaa", "aaaa");
		return;
	}
	
	
	public String strStr(String haystack, String needle) {
        if(needle.length() ==0) return haystack;
        for(int i=0; i<haystack.length(); i++){
            for(int j=0; j<needle.length(); j++){
                if (haystack.length() - i + 1 < needle.length())
			        return null;
                
                if( i+j>= haystack.length() || haystack.charAt(i+j) != needle.charAt(j))
                    break;
                else if(j == needle.length()-1)
                    return haystack.substring(i);
            }
        }
        return null;
    }

}
