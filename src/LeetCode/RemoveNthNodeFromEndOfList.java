package LeetCode;

public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preNode = new ListNode(0);
        preNode.next = head;
        ListNode result = preNode;
        
        for(int i=1; i<n; i++){
            head = head.next;
        }
        while(head.next != null){
            preNode = preNode.next;
            head = head.next;
        }
        preNode.next = preNode.next.next;
        return result.next;
    }

}
