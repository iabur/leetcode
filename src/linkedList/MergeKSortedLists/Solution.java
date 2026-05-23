package linkedList.MergeKSortedLists;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // 1. Handle edge cases
        if (lists == null || lists.length == 0) {
            return null;
        }

        // 2. Create a Min-Heap based on the nodes' values
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(lists.length, Comparator.comparingInt(a -> a.val));

        // 3. Add the head (first node) of every list into the heap
        for (ListNode node : lists) {
            if (node != null) {
                priorityQueue.add(node);
            }
        }

        // 4. Create a dummy node to easily build the result list
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        // 5. Process the heap until it's empty
        while (!priorityQueue.isEmpty()) {
            ListNode minValue = priorityQueue.poll();
            head.next = minValue;
            head = head.next;

            if (minValue.next != null) {
                priorityQueue.add(minValue.next);
            }
        }

        // Return the actual head of the merged list
        return dummy.next;
    }
}