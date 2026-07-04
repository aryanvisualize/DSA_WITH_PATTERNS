//24. Swap Nodes in Pairs

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode t1 = head;
        ListNode t2 = head.next;
        ListNode t3 = dummy;
        while(t1 != null && t2 != null){
            t3.next = t2;
            t1.next = t2.next;
            t2.next = t1;
            t3 = t1;
            t1 = t1.next;
            if(t1 != null) t2 = t1.next;
        }
        return dummy.next;
    }
}