package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

	public static void main(String[] args) {
		GrayCode gc = new GrayCode();
		gc.grayCode(3);
	}

	public List<Integer> grayCode(int n) {
		List<Integer> res = new ArrayList<Integer>();  
        if(n==0) {  
            res.add(0);  
            return res;  
        }  
          
        List<Integer> preRes = grayCode(n-1);  
        res.addAll(preRes);  
        for(int i=preRes.size()-1; i>=0; i--){  
            res.add(preRes.get(i)+(int)Math.pow(2, n-1));  
        }  
        return res;  
	}
	

}
