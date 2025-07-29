import java.util.*;

public class F09_BinaryTreeLeftView {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vals = sc.nextLine().split(" ");
        if (vals.length == 0 || vals[0].equals("-1")) return;

        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < vals.length) {
            TreeNode curr = queue.poll();
            if (!vals[i].equals("-1")) {
                curr.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(curr.left);
            }
            i++;
            if (i < vals.length && !vals[i].equals("-1")) {
                curr.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(curr.right);
            }
            i++;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        System.out.print("LeftView:");
        while (!q.isEmpty()) {
            int size = q.size();
            for (int j = 0; j < size; j++) {
                TreeNode node = q.poll();
                if (j == 0) System.out.print(" " + node.val);
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
        }
        System.out.println();
    }
}
