package LeetCode;

public class RecoverBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	TreeNode pre;
	TreeNode first;
	TreeNode second;

	public void recoverTree(TreeNode root) {
		pre = null;
		first = null;
		second = null;
		inorder(root);
		if(first!=null && second!= null){
		    int tmp = first.val;
		    first.val = second.val;
		    second.val = tmp;
		}
	}
	
	public void inorder(TreeNode root){
		if(root == null) return;
		inorder(root.left);
		if(pre == null){
			pre = root;
		}
		else{
			if(pre.val > root.val){
				if(first == null){
					first = pre;
				}
				second = root;
			}
			pre = root;
		}
		inorder(root.right);
	}

}
