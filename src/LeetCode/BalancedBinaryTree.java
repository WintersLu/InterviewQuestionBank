package LeetCode;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isBalanced(TreeNode root) {
        if(recursiveBalance(root) == -1) return false;
        else return true;
    }
    
    public int recursiveBalance(TreeNode node) {
        if(node == null) return 0;

        int left = recursiveBalance(node.left);
        int right = recursiveBalance(node.right);
        if(left == -1 || right == -1) return -1;
        if(Math.abs(left-right) <= 1)
            return Math.max(left, right) + 1;
        else return -1;
        
    }

}
