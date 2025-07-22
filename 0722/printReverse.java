public class printReverse {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void reversePrint(ListNode head) {
        if (head == null) return;
        reversePrint(head.next);
        System.out.print(head.val + " ");
    }

    public static void main(String[] args) {
        // 建立鏈結串列: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        reversePrint(head); // 預期輸出：5 4 3 2 1
    }
}
