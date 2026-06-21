//141. Linked List Cycle

public class Solution {
    public boolean hasCycle(ListNode head) {
        //Fast & Slow Pointer
        //Floyd’s Cycle Detection Algorithm


        if(head==null || head.next == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) return true;
        }
        return false;



        // if(head==null || head.next == null) return false;
        // ListNode fast = head;
        // ListNode slow = head;

        // while(fast != null){
        //     if(slow == null) return false;
        //     slow = slow.next;
        //     if(fast.next == null) return false;
        //     fast = fast.next.next;
        //     if(fast == slow) return true;
        // }
        // return false;

    }
}