package linkedList.ReorderList;

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        
        // Step 1: Find the middle using slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Step 2: Reverse the second half of the list
        // 'slow' is currently at the middle node
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null; // Sever the first half from the second half
        
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        
        // Step 3: Merge the two halves
        // 'head' points to the start of the first half
        // 'prev' points to the start of the reversed second half
        ListNode first = head;
        ListNode second = prev;
        
        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            
            // Wire the nodes together
            first.next = second;
            second.next = temp1;
            
            // Move both pointers forward
            first = temp1;
            second = temp2;
        }
    }
}