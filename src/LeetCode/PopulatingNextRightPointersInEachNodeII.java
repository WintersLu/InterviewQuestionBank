package LeetCode;

public class PopulatingNextRightPointersInEachNodeII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void connect(TreeLinkNode node){
        if(node == null) return;
        
        
        TreeLinkNode p = node.next;
        while(p != null){
            if(p.left != null) {
                p = p.left;
                break;
            }
            if(p.right != null) {
                p = p.right;
                break;
            }
            p = p.next;
        }
        
        if(node.right != null) node.right.next = p;
        if(node.left != null) node.left.next = node.right == null? p:node.right;
        
        
        
        connect(node.right);
        connect(node.left);
    }
	

}
