package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		Combinations c = new Combinations();
		c.recursiveCom(new ArrayList<Integer>(), 2, 4);
		
	}

	public List<List<Integer>> recursiveCom(List<Integer> enter, int k, int n) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(k == 1){
			for(int i=1; i<=n; i++){
				List<Integer> item = new ArrayList<Integer>(enter);
				item.add(0, i);
				result.add(item);
			}
			return result;
		}
		
		if (k == n) {
			List<Integer> item = new ArrayList<Integer>(enter);
			item.add(0, n);
			result.addAll(recursiveCom(item, k - 1, n - 1));
		} else if (k < n) {
			List<Integer> item = new ArrayList<Integer>(enter);
			item.add(0, n);
			result.addAll(recursiveCom(item, k - 1, n - 1));
			result.addAll(recursiveCom(enter, k, n - 1));
		}

		return result;
	}

}
