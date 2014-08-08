package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> fourSum(int[] num, int target) {
		Arrays.sort(num);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (num.length < 4)
			return result;

		for (int i = 0; i < num.length; i++) {
			if (i > 0 && num[i] == num[i - 1])
				continue;

			for (int l = i + 1; l < num.length; l++) {
				if (l > i + 1 && num[l] == num[l - 1])
					continue;

				int start = l + 1;
				int end = num.length - 1;
				while(start < end){
					int value = num[i] + num[l] + num[start] + num[end];
					if(value == target){
						ArrayList<Integer> line = new ArrayList<Integer>();
						line.add(num[i]);
						line.add(num[l]);
						line.add(num[start]);
						line.add(num[end]);
						result.add(line);

						do{start++;} while(start<end && num[start] == num[start-1]);
						do{end--;} while(start<end && num[end] == num[end+1]);
						
					}else if(value > target){
						end--;
					}else {
						start++;
					}
				}
			}
		}

		return result;
	}

}
