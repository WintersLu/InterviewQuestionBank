package LeetCode;

public class PopulatingNextRightPointersInEachNode {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void connect(TreeLinkNode root) {
        if(root == null) return;
        recurConnect(root, null);
    }
    
    public void recurConnect(TreeLinkNode node, TreeLinkNode topRight){
        if(node == null) return;
        node.next = topRight;
        recurConnect(node.left, node.right);
        if(node.next != null)
            recurConnect(node.right, node.next.left);
        else recurConnect(node.right, null);
        return;
    }
}
