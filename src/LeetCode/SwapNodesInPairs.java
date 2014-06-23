package LeetCode;

public class SwapNodesInPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode swapPairs(ListNode head) {

        ListNode pre = new ListNode(0);
        ListNode first = head;
        pre.next = first;
        ListNode second;
        if(first != null && first.next != null) head = head.next;
        
        while(first != null && first.next != null){
            
            second = first.next;
            pre.next = second;
            first.next = second.next;
            second.next = first;
            //
            pre = first;
            first = first.next;
        }
        return head;
    }

}
