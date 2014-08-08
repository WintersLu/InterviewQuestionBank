package LeetCode;

public class FlattenBinaryTreeToLinkedList {

	public static void main(String[] args) {
		FlattenBinaryTreeToLinkedList f = new FlattenBinaryTreeToLinkedList();
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		root.left = node1;
		
		f.flatten(root);

	}
	
	public void flatten(TreeNode root) {
        if(root == null) return;
        recurFlat(root);
    }
    
    public TreeNode recurFlat(TreeNode node) {
        if(node.left == null && node.right == null) return node;

        
        if(node.left == null){
        	return recurFlat(node.right); 
        }
        TreeNode right = node.right;
        node.right = node.left;
        node.left = null;
        
        TreeNode lastRight = recurFlat(node.right);
        lastRight.right = right;
        return recurFlat(node.right);
    }

}
