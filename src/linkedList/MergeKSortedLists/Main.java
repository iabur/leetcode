package linkedList.MergeKSortedLists;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Dummy input: [[1,4,5],[1,3,4],[2,6]]
        int[][] input = {
                {1, 4, 5},
                {1, 3, 4},
                {2, 6}
        };

        ListNode[] lists = new ListNode[input.length];
        for (int i = 0; i < input.length; i++) {
            lists[i] = build(input[i]);
        }

        ListNode merged = solution.mergeKLists(lists);
        printList(merged);
    }

    private static ListNode build(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        return head;
    }

    private static void printList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append("->");
            head = head.next;
        }
        System.out.println(sb.toString());
    }
}
