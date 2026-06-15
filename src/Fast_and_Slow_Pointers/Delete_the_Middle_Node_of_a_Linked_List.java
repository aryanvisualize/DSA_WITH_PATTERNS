//2095. Delete the Middle Node of a Linked List

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        //Fast and slow pointer
        if(head == null || head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast != null && fast.next != null ){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;

        // //Brute force --> counting the number of nodes, O(n) time
        // if(head.next == null) return null;
        // ListNode temp = head;
        // int count = 0;
        // while(temp != null){
        //     temp = temp.next;
        //     count++;
        // }
        // temp = head;
        // for(int i=0; i<(count/2)-1; i++){
        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;
        // return head;
    }
}