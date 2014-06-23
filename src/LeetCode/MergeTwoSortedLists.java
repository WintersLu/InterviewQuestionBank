package LeetCode;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(1);
        result.next = l1;
        ListNode l1pre = result;
        
        while(l1 != null && l2 != null){
            if(l1.val >= l2.val) {
                ListNode insert = l2;
                l2 = l2.next;
                l1pre.next = insert;
                insert.next = l1;
                l1pre = l1pre.next;
            }else{
                l1 = l1.next;
                l1pre = l1pre.next;
            }
        }
        if(l1 == null) l1pre.next = l2;
        return result.next;
    }

}
