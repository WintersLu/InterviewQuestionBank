package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SumRootToLeafNumbers {

	public static void main(String[] args) {
		SumRootToLeafNumbers sm = new SumRootToLeafNumbers();
		TreeNode root = new TreeNode(9);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		root.left = node1;
		root.right = node2;
		sm.sumNumbers(root);
	}
	
	
	public int sumNumbers(TreeNode root) {
        List<String> result = new ArrayList<String>();
        int sum = 0;
        if(root == null) return sum;
        result = recurSum(result, "", root);
        for(String item : result){
            sum += Integer.parseInt(item);
        }
        return sum;
    }
    
    public List<String> recurSum(List<String> allNum, String num, TreeNode node){
    	if(node.left == null && node.right == null)
    		allNum.add(num + node.val);
    	else {
    		if(node.left != null) allNum = recurSum(allNum, num + node.val, node.left);
    		if(node.right != null) allNum = recurSum(allNum, num + node.val, node.right);
    	}
    	return allNum;
    }

}
