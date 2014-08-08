package LeetCode;

public class ReorderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void reorderList(ListNode head) {
        if(head == null) return;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        second = reverseOrder(second);
        
        ListNode p1 = head;
        ListNode p2 = second;
        while(p2 != null){
            ListNode tmp1 = p1.next;
            ListNode tmp2 = p2.next;
            p1.next = p2;
            p2.next = tmp1;
            p1 = tmp1;
            p2 = tmp2;
        }
    }
    
    public ListNode reverseOrder(ListNode head){
        if(head == null || head.next == null)
            return head;
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        head.next = null;
        return pre;
    }
}
