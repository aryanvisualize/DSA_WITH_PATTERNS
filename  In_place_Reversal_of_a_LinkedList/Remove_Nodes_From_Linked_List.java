//2487. Remove Nodes From Linked List


class Solution {
    // Using reverse List -> Optimal Approach
    private ListNode reverse(ListNode node){
        ListNode curr = node;
        ListNode prev = null;
        while(curr != null){
            ListNode Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
    
    public ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null) return head;
        head = reverse(head);
        ListNode temp = head;
        while(temp != null && temp.next != null){
            if(temp.next.val < temp.val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        head = reverse(head);
        return head;
    }
}
