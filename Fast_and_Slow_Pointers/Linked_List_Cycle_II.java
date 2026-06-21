//142. Linked List Cycle II

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        //Step 1 --> Detect Cycle
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){   //Step 2-> Find cycle start
                slow = head;    //put 1 of pointer to head
                while(slow != fast){
                    slow = slow.next;   //move both pointers together unit they meet on same node
                    fast = fast.next;
                }
                return fast;    //return node where they met.
            }
        }
        return null;
    }
}