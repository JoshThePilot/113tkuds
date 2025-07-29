import java.util.*;

public class F12_TreeDiameter {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    static int diameter = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vals = sc.nextLine().split(" ");

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

        depth(root);
        System.out.println("Diameter: " + diameter);
    }

    static int depth(TreeNode node) {
        if (node == null) return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        diameter = Math.max(diameter, left + right);
        return Math.max(left, right) + 1;
    }
}
