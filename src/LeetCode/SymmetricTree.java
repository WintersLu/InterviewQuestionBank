package LeetCode;

public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return recursiveSymmetric(root.left, root.right);
    }
    
    public boolean recursiveSymmetric(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if((left == null && right != null) || (left != null && right == null)) return false;
        if(left.val != right.val) return false;
        boolean l = recursiveSymmetric(left.left, right.right);
        boolean r = recursiveSymmetric(left.right, right.left);
        return l && r;
    }

}
