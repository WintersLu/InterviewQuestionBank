package LeetCode;


public class InsertionSortList {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(6);
		ListNode node2 = new ListNode(5);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(1);
		ListNode node5 = new ListNode(8);
		ListNode node6 = new ListNode(7);
		ListNode node7 = new ListNode(2);
		ListNode node8 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		InsertionSortList i = new InsertionSortList();
		i.insertionSortList(node1);
		
	}

	public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode run = head;
        
        while(run != null && run.next != null){
        	if(run.val > run.next.val){
                ListNode smallNode = run.next;
                ListNode pre = preHead;
                while(pre.next.val < smallNode.val)
                    pre = pre.next;
                ListNode tmp = pre.next;
                pre.next = smallNode;
                run.next = smallNode.next;
                smallNode.next = tmp;
            }
            else{
                run = run.next;
            }
        }
        return preHead.next;
    }

}
