package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public RandomListNode copyRandomList(RandomListNode head) {

		RandomListNode pointer = new RandomListNode(0);
		RandomListNode result = pointer;
		RandomListNode head2 = head;
		Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
		
		while(head != null){
			RandomListNode node = new RandomListNode(head.label);
			map.put(head, node);
			pointer.next = node;
			pointer = pointer.next;
			head = head.next;
		}
		
		while(head2 != null){
			if(head2.random != null){
				map.get(head2).random = map.get(head2.random); 
			}
			head2 = head2.next;
		}
		return result.next;
	}

}
