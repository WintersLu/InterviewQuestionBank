package LeetCode;

public class RemoveDuplicatesFromSortedListII {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		node1.next = node2;
		node2.next = node3;
		RemoveDuplicatesFromSortedListII r = new RemoveDuplicatesFromSortedListII();
		r.deleteDuplicates(node2);
	}
	
	
	
	
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode preHead = new ListNode(0);
        ListNode lastNot = preHead;
        preHead.next = head;
        
        head = head.next;
        while(head != null){
            if(lastNot.next.val != head.val && lastNot.next.next != head){
                lastNot.next = head;
                head = head.next;
            }else if(lastNot.next.val != head.val && lastNot.next.next == head){
                lastNot = lastNot.next;
                head = head.next;
            }else{
                head = head.next;
            }
        }
        if(lastNot.next.next != null){
            lastNot.next = null;
        }
        return preHead.next;
        
    }

}
