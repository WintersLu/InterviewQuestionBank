package LeetCode;

public class PathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if(root.left == null && root.right == null && sum - root.val == 0) {
            return true;
        }
        else if(root.left == null && root.right == null && sum - root.val != 0){
            return false;
        }
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }

}
