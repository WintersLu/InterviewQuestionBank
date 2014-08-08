package LeetCode;

public class ReverseLinkedListII {

	public static void main(String[] args) {

		ListNode input = new ListNode(1);
		ListNode input1 = new ListNode(2);
		ListNode input2 = new ListNode(3);
		ListNode input3 = new ListNode(4);
		ListNode input4 = new ListNode(5);
		ListNode input5 = new ListNode(6);

		input.next = input1;
		input1.next = input2;
		input2.next = input3;
		input3.next = input4;
		input4.next = input5;

	}

	public ListNode reverseBetween(ListNode head, int m, int n) {
		if(head == null || head.next == null) return head;
		
		ListNode preNode = new ListNode(0);
		preNode.next = head;
		ListNode ahead = head;
		ListNode current = head;
		
		for(int i=0; i<n-m; i++)
			ahead = ahead.next;
		
		for(int i=1; i<m; i++){
			preNode = current;
			ahead = ahead.next;
			current = current.next;
		}
		
		boolean fromHead = false;
		if(current == head) fromHead = true;
		while(ahead != current){
			ListNode tmp = ahead.next;
			ahead.next = current;
			preNode.next = current.next;
			current.next = tmp;
			current = preNode.next;
		}
		if(fromHead) return ahead;
		
		return head;
		
	}

}
