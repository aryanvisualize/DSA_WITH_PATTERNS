
class Solution {

    public ListNode sortList(ListNode head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Break the linked list into two halves
        prev.next = null;

        // Recursively sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        // Merge both sorted halves
        return merge(left, right);
    }

    private ListNode merge(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }

            current = current.next;
        }

        // Attach remaining nodes
        if (l1 != null) {
            current.next = l1;
        }

        if (l2 != null) {
            current.next = l2;
        }

        return dummy.next;
    }
}





// class Solution {
//     public ListNode sortList(ListNode head) {
//         //Naive approach -> O(nlog) Time-Complexity & O(n) space
//         if(head==null || head.next == null) return head;
//         ArrayList<Integer> arr = new ArrayList<>();
//         ListNode temp = head;
//         while(temp != null){
//             arr.add(temp.val);
//             temp = temp.next;
//         }
//         int n = arr.size();
//         int[] nums = new int[n];
//         for(int i=0; i<n; i++){
//             nums[i] = arr.get(i);
//         }
//         mergeSort(nums, 0, n-1);
//         temp = head;

//         for(int i=0; i<n; i++){
//             temp.val = nums[i];
//             temp = temp.next;
//         }
//         return head;
//     }

//     private void mergeSort(int[] nums, int low, int high){
//         if(low >= high) return;
//         int mid = low+(high-low)/2;
//         mergeSort(nums, low, mid);
//         mergeSort(nums, mid+1, high);
//         merge(nums, low, high);
//     }

//     private int[] merge(int[] nums, int low, int high){
//         int mid = low+ (high-low)/2;
//         int n1 = mid-low+1;
//         int n2 = high-mid;
//         int[] num1 = new int[n1];
//         int[] num2 = new int[n2];

//         int k= low;
//         for(int i=0; i<n1; i++){
//             num1[i] = nums[k++];
//         }

//         k= mid+1;
//         for(int i=0; i<n2; i++){
//             num2[i] = nums[k++];
//         }

//         //Merge 2 Sorted Arrays
//         k = low;
//         int i=0;
//         int j=0;

//         while(i<n1 && j<n2){
//             if(num1[i] < num2[j]){
//                 nums[k++] = num1[i++];
//             }
//             else{
//                 nums[k++] = num2[j++];
//             }
//         }

//         while(i<n1){
//             nums[k++] = num1[i++];
//         }
//         while(j<n2){
//             nums[k++] = num2[j++];
//         }
//         return nums;
//     }
// }
