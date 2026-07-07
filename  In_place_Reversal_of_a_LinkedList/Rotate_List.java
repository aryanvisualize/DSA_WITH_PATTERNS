//61. Rotate List

class Solution {
    private int length(ListNode node){
        int count = 0;
        while(node != null){
            node = node.next;
            count++;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int n = length(head);
        k = k % n;
        if(k == 0) return head;
        ListNode fast = head;
        ListNode slow = head;

        for(int i=1;i<=k+1;i++){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode a = slow.next;
        slow.next = null;
        ListNode t = a;
        while(t.next != null){
            t = t.next;
        }
        t.next = head;
        return a;
    }
}