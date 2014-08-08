package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

	public static void main(String[] args) {
		SubsetsII s = new SubsetsII();
		int[] input = {1, 1, 1, 1};
		s.subsetsWithDup(input);

	}

	public List<List<Integer>> subsetsWithDup(int[] num) {

		if(num == null) return null;
        Arrays.sort(num);
        
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(new ArrayList<Integer>());

		Integer pre = (Integer)null;
		List<List<Integer>> preCopy = null;
		for (int i = 0; i < num.length; i++) {
			List<List<Integer>> copy = new ArrayList<List<Integer>>();
			
			if(pre == null || pre != num[i]){
				for(List<Integer> item: result)
					copy.add(new ArrayList<Integer>(item));
			}else{
				for(List<Integer> item: preCopy)
					copy.add(new ArrayList<Integer>(item));
			}

			for (int k = 0; k < copy.size(); k++) {
				copy.get(k).add(num[i]);
			}
			pre = num[i];
			preCopy = copy;
			result.addAll(copy);
		}
		return result;

	}

}
