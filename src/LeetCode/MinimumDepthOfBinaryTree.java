package LeetCode;

public class MinimumDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int left = root.left == null? Integer.MAX_VALUE : minDepth(root.left)+1;
        int right = root.right == null? Integer.MAX_VALUE : minDepth(root.right)+1;
        return Math.min(left, right);
    }

}
