//876. Middle of the Linked List

class Solution {
    public ListNode middleNode(ListNode head) {
        //Using count method
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        temp = head;
        for(int i=0;i<count/2;i++){
            temp = temp.next;
        }
        return temp;
    }

    // //Using Fast and Slow Pointers
    // if(head.next == null) return head;
    // ListNode fast = head;
    // ListNode slow = head;
    // while(fast.next != null){
    //     if(fast.next.next == null) return slow.next;
    //     fast = fast.next.next;
    //     slow = slow.next;
    // }
    // return slow;
}