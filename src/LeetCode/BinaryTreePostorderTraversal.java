package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        return recursivePost(result, root);
    }
    
    public List<Integer> recursivePost(List<Integer> list, TreeNode node){
        if(node == null) return list;
        
        list = recursivePost(list, node.left);
        list = recursivePost(list, node.right);
        list.add(node.val);
        return list;
    }

}
