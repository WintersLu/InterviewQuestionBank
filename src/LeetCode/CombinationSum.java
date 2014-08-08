package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		CombinationSum c = new CombinationSum();
		int[] input = {2,3,6,7};
		c.combinationSum(input, 7);

	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		
		result = recurComb(result, list, candidates, target, 0);
		return result;
	}
	
	
	public List<List<Integer>> recurComb(List<List<Integer>> list, List<Integer> comb, int[] candidates, int target, int start){
		
		List<Integer> row = new ArrayList<Integer>(comb);
		if(target == 0){
			list.add(row);
			return list;
		}
		if(target < 0) return list;
		
		for(int i=start; i<candidates.length; i++){
			target -= candidates[i];
			row.add(candidates[i]);
			list = recurComb(list, row, candidates, target, i);
			target += candidates[i];
			row.remove(row.size()-1);
		}
		return list;
	}

}
