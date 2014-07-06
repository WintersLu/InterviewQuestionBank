package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();
        if(root == null) return result;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int currentLevel = 1;
        int nextLevel = 0;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            row.add(node.val);
            if(node.left != null){
                queue.offer(node.left);
                nextLevel++;
            }
            if(node.right != null){
                queue.offer(node.right);
                nextLevel++;
            }
            currentLevel--;
            if(currentLevel == 0){
                result.add(row);
                row = new ArrayList<Integer>();
                currentLevel = nextLevel;
                nextLevel = 0;
            }
        }
        return result;
        
    }

}
