package linkedList.ReorderList;

class Solution {

    public void reorderList(ListNode head) {

        // No need to reorder if list has 0 or 1 node
        if (head == null || head.next == null) {
            return;
        }

        // ---------------------------------------------------
        // STEP 1: Find the middle of the linked list
        // ---------------------------------------------------
        //
        // slow moves 1 step at a time
        // fast moves 2 steps at a time
        //
        // When fast reaches the end,
        // slow will be at the middle.
        //
        // Example:
        // 1 -> 2 -> 3 -> 4 -> 5
        //                ^
        //              slow
        //
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // ---------------------------------------------------
        // STEP 2: Reverse the second half
        // ---------------------------------------------------
        //
        // Original:
        // 1 -> 2 -> 3 -> 4 -> 5
        //           ^
        //         slow
        //
        // Second half:
        // 4 -> 5
        //
        // After reverse:
        // 5 -> 4
        //
        ListNode second = reverse(slow.next);

        // Cut the list into two separate halves
        //
        // First half:
        // 1 -> 2 -> 3
        //
        // Second half:
        // 5 -> 4
        //
        slow.next = null;

        // ---------------------------------------------------
        // STEP 3: Merge the two halves
        // ---------------------------------------------------
        //
        // First half : 1 -> 2 -> 3
        // Second half: 5 -> 4
        //
        // Result:
        // 1 -> 5 -> 2 -> 4 -> 3
        //
        ListNode first = head;

        while (second != null) {

            // Save next nodes before changing links
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            // Insert node from second half
            //
            // Before:
            // first -> firstNext
            //
            // After:
            // first -> second -> firstNext
            //
            first.next = second;
            second.next = firstNext;

            // Move both pointers forward
            first = firstNext;
            second = secondNext;
        }
    }

    private ListNode reverse(ListNode head) {

        // prev points to the already reversed part
        ListNode prev = null;

        while (head != null) {

            // Save next node
            ListNode next = head.next;

            // Reverse current link
            head.next = prev;

            // Move pointers forward
            prev = head;
            head = next;
        }

        // prev becomes the new head
        return prev;
    }
}