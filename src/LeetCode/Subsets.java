package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		Subsets s = new Subsets();
		int[] input = {1, 2, 3};
		s.subsets(input);

	}
	
	public List<List<Integer>> subsets(int[] S) {
        if(S == null) return null;
        
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());

        Arrays.sort(S);
        for(int i=0; i<S.length; i++){
            List<List<Integer>> tmp = new ArrayList<List<Integer>>();
            for (List<Integer> a : result) {
    			tmp.add(new ArrayList<Integer>(a));
    		}
            for(List<Integer> oneList : tmp){
                oneList.add(S[i]);
            }
            result.addAll(tmp);
        }
        return result;
        
    }

}
