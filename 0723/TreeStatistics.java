class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class TreeStatistics {
    public static int sum(TreeNode root) {
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public static int max(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    public static int min(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }

    public static int countLeaves(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return countLeaves(root.left) + countLeaves(root.right);
    }

    public static int height(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        System.out.println("Sum: " + sum(root));
        System.out.println("Max: " + max(root));
        System.out.println("Min: " + min(root));
        System.out.println("Leaves: " + countLeaves(root));
        System.out.println("Height: " + height(root));
    }
}
