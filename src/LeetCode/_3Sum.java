package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> threeSum(int[] num) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(num.length < 3) return result;
		Arrays.sort(num);
		
		for(int i=0; i<num.length-2; i++){
			if(i==0 || num[i] > num[i-1]){
				int start = i+1;
				int end = num.length - 1;
				
				while(start < end){
					if(num[start] + num[end] == -num[i]){
						List<Integer> line = new ArrayList<Integer>();
						line.add(num[i]);
						line.add(num[start]);
						line.add(num[end]);
						result.add(line);
						start++;
						end--;
						while(start < end && num[end] == num[end+1]) end--;
						while(start < end && num[start] == num[start-1]) start++;
						
					}else if(num[start] + num[end] < -num[i]){
						start++;
					}else{
						end--;
					}
				}
			}
		}
		return result;

	}

}
