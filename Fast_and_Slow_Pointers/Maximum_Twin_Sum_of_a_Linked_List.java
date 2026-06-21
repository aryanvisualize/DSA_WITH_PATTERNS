//2130. Maximum Twin Sum of a Linked List

class Solution {
    //Fast & slow Pointer using O(n) time & O(1) space
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode temp = reverseList(slow.next);
        slow.next = temp;

        ListNode p1 = head;
        ListNode p2 = temp;

        int maxSum = Integer.MIN_VALUE;
        while(p2 != null){
            if(p1.val + p2.val > maxSum){
                maxSum = p1.val + p2.val;
            }
            p1 = p1.next;
            p2 = p2.next;

        }
        return maxSum;
    }
    private ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
}