package LeetCode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

	public static void main(String[] args) {
		ConstructBinaryTreeFromPreorderAndInorderTraversal b = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
		int[] a1 = {1,2,3};
		int[] b1 = {1,2,3};
		b.buildTree(a1, b1);
	}
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, inorder, 0, inorder.length-1);
		
	}
	
	public TreeNode buildTree(int[] preorder, int index, int[] inorder, int is, int ie){
        if(is == ie) return new TreeNode(inorder[is]);
        if(is > ie) return null;
        
        TreeNode top = new TreeNode(preorder[index]);
        int center =-1;
        for(int i=is; i<=ie; i++){
            if(inorder[i] == preorder[index]) center = i;
        }
        
        top.left = buildTree(preorder, index+1, inorder, is, center-1);
        top.right = buildTree(preorder, index+(center-is)+1, inorder, center+1, ie);
        return top;
    }

}
