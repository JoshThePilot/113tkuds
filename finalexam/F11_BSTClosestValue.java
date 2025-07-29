import java.util.*;

public class F11_BSTClosestValue {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vals = sc.nextLine().split(" ");
        int target = sc.nextInt();

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

        System.out.println("Closest: " + findClosest(root, target));
    }

    static int findClosest(TreeNode node, int target) {
        int closest = node.val;
        while (node != null) {
            if (Math.abs(node.val - target) < Math.abs(closest - target) ||
                (Math.abs(node.val - target) == Math.abs(closest - target) && node.val < closest)) {
                closest = node.val;
            }
            if (target < node.val) node = node.left;
            else if (target > node.val) node = node.right;
            else break;
        }
        return closest;
    }
}
