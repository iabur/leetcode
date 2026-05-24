package linkedList.RemoveNthNode;

import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode result = solution.removeNthFromEnd(head, 2);
        printList(result);
    }

    private static void printList(ListNode node) {
        StringBuilder builder = new StringBuilder();
        while (node != null) {
            builder.append(node.val);
            if (node.next != null) {
                builder.append(" -> ");
            }
            node = node.next;
        }
        LOGGER.info(builder::toString);
    }
}
