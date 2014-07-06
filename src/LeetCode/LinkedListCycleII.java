package LeetCode;

public class LinkedListCycleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode twoStep = head;
        ListNode oneStep = head;
        ListNode result = head;
        
        boolean loop = false;
        while(twoStep.next != null && twoStep.next.next != null){
            twoStep = twoStep.next.next;
            oneStep = oneStep.next;
            if(twoStep == oneStep){
                loop = true;
                break;
            }
        }
        if(loop){
            while(result != twoStep){
                result = result.next;
                twoStep = twoStep.next;
            }
            return result;
        }
        return null;
    }

}
