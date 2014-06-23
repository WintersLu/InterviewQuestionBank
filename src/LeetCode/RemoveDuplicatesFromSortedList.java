package LeetCode;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode result = head;
        ListNode last = head;
        head = head.next;
        while(head != null){
            if(head.val != last.val){
                last.next = head;
                last = last.next;
            }
            head = head.next;
        }
        last.next = null;
        return result;
    }

}
