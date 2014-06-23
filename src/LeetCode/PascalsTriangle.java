package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for(int i=0; i<numRows; i++){
            List<Integer> item = new ArrayList<Integer>();
            for(int l=0; l<i+1; l++){
                if(l == 0 || l == i)
                    item.add(1);
                else{
                    item.add(result.get(i-1).get(l-1) + result.get(i-1).get(l));
                }
            }
            result.add(item);
            
        }
        return result;
    }

}
