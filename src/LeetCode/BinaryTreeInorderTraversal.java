package LeetCode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new LinkedList<Integer>();
        return recursive(root, l);
    }
    
    public List<Integer> recursive(TreeNode node, List<Integer> list){
        if(node == null) return list;
        list = recursive(node.left, list);
        list.add(node.val);
        list = recursive(node.right, list);
        return list;
    }

}
