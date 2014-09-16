package LeetCode;

import java.util.Stack;

public class LargestRectangleInHistogram {

	public static void main(String[] args) {
		LargestRectangleInHistogram l = new LargestRectangleInHistogram();
		int[] input = {2,1,5,6,2,3};
		l.largestRectangleArea(input);

	}

	public int largestRectangleArea(int[] height) {
		
		int maxRect = 0;
		int[] moreHeight = new int[height.length+1];
		for(int i=0; i<height.length; i++)
			moreHeight[i] = height[i];
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<moreHeight.length; i++){
			if(!stack.isEmpty() && moreHeight[i] < moreHeight[stack.peek()]){
				
				while(!stack.isEmpty() && moreHeight[i] < moreHeight[stack.peek()]){
					int curHeight = moreHeight[stack.pop()];
					if(stack.isEmpty()) maxRect = Math.max(maxRect, i * curHeight);
					else maxRect = Math.max(maxRect, (i - stack.peek() - 1) * curHeight);
				}
				
			}
			stack.push(i);
		}
		return maxRect;
		
	}

}
