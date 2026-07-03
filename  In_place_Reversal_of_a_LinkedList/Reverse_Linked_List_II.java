//92. Reverse Linked List II

class Solution {
    private ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        while (curr != null) {
            ListNode Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode t1 = dummy;
        ListNode t2 = dummy;

        int count = 1;
        while (count <= right) {
            if(count < left){
                t1 = t1.next;
            }
            t2 = t2.next;
            count++;
        }

        ListNode front = t1;
        ListNode start = t1.next;
        ListNode back = t2.next;

        t2.next = null;
        ListNode newHead = reverse(start);

        front.next = newHead;
        start.next = back;
        return dummy.next;
    }
}