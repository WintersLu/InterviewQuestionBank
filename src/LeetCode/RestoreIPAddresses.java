package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {

	public static void main(String[] args) {
		RestoreIPAddresses r = new RestoreIPAddresses();
		r.restoreIpAddresses("25525511135");

	}
	
	
	public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
        result = dfs(result, s, 1, "");
        return result;
    }
    
    public List<String> dfs(List<String> result, String s, int index, String one){
        if(index == 4 && !isValid(s)) return result;
        else if(index == 4){
            result.add(one + "." + s);
            return result;
        }
        
        for(int i=1; i<=3 && i<s.length(); i++){
            String input = one;
            if(isValid(s.substring(0, i))){
                if(input == "") input += s.substring(0, i);
                else input += "." + s.substring(0, i);
                result = dfs(result, s.substring(i), index+1, input);
            }
        }
        return result;
    }
    
    private boolean isValid(String str)  
    {  
        if(str==null || str.length()>3)  
            return false;  
        int num = Integer.parseInt(str);  
        if(str.charAt(0)=='0' && str.length()>1)  
            return false;  
        if(num>=0 && num<=255)  
            return true;  
        return false;  
    }

}
