package linkedList.ReorderList;

public class Main {
    public static void main(String[] args) {
        // Create linked list from array [1,2,3,4]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Call the solution
        Solution solution = new Solution();
        solution.reorderList(head);

        // Print the result
        System.out.print("Reordered list: ");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
