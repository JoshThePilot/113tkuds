import java.util.*;

public class F10_BSTRangeSum {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nodes = sc.nextLine().split(" ");
        int L = sc.nextInt();
        int R = sc.nextInt();

        if (nodes.length == 0 || nodes[0].equals("-1")) return;

        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < nodes.length) {
            TreeNode curr = queue.poll();
            if (!nodes[i].equals("-1")) {
                curr.left = new TreeNode(Integer.parseInt(nodes[i]));
                queue.add(curr.left);
            }
            i++;
            if (i < nodes.length && !nodes[i].equals("-1")) {
                curr.right = new TreeNode(Integer.parseInt(nodes[i]));
                queue.add(curr.right);
            }
            i++;
        }

        System.out.println("Sum: " + rangeSum(root, L, R));
    }

    static int rangeSum(TreeNode node, int L, int R) {
        if (node == null) return 0;
        if (node.val < L) return rangeSum(node.right, L, R);
        if (node.val > R) return rangeSum(node.left, L, R);
        return node.val + rangeSum(node.left, L, R) + rangeSum(node.right, L, R);
    }
}
