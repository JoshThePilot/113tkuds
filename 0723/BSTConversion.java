import java.util.*;

public class BSTConversion {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    static class DoublyListNode {
        int val;
        DoublyListNode prev, next;
        DoublyListNode(int x) { val = x; }
    }

    static DoublyListNode prev = null, head = null;

    public static void bstToDoublyList(TreeNode root) {
        if (root == null) return;
        bstToDoublyList(root.left);
        DoublyListNode node = new DoublyListNode(root.val);
        if (prev == null) head = node;
        else {
            prev.next = node;
            node.prev = prev;
        }
        prev = node;
        bstToDoublyList(root.right);
    }

    public static TreeNode sortedArrayToBST(int[] nums, int l, int r) {
        if (l > r) return null;
        int mid = (l + r) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, l, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, r);
        return root;
    }

    static int sum = 0;

    public static void convertToGreaterTree(TreeNode root) {
        if (root == null) return;
        convertToGreaterTree(root.right);
        sum += root.val;
        root.val = sum;
        convertToGreaterTree(root.left);
    }

    public static void inorderPrint(TreeNode root) {
        if (root == null) return;
        inorderPrint(root.left);
        System.out.print(root.val + " ");
        inorderPrint(root.right);
    }

    public static void printDoublyList(DoublyListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        TreeNode bst = sortedArrayToBST(nums, 0, n - 1);
        System.out.print("中序：");
        inorderPrint(bst);
        System.out.println();

        bstToDoublyList(bst);
        System.out.print("雙向鏈表：");
        printDoublyList(head);
        System.out.println();

        convertToGreaterTree(bst);
        System.out.print("greater tree：");
        inorderPrint(bst);
    }
}
