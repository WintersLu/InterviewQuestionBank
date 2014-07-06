package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        return recursiveParenthesis(result, n, 0, "");
    }
    
    public List<String> recursiveParenthesis(List<String> list, int left, int right, String item) {
        if(left > 0) list = recursiveParenthesis(list, left-1, right + 1, item + "(");
        if(right > 0) list = recursiveParenthesis(list, left, right - 1, item + ")");
        if(left == 0 && right == 0)
            list.add(item);
        return list;
    }

}
