public class TreeDistance {
    public static int findDistance(TreeNode root, int p, int q) {
        TreeNode lca = lowestCommonAncestor(root, p, q);
        return depth(lca, p, 0) + depth(lca, q, 0);
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
        if (root == null || root.val == p || root.val == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }

    private static int depth(TreeNode root, int val, int d) {
        if (root == null) return -1;
        if (root.val == val) return d;
        int left = depth(root.left, val, d + 1);
        if (left != -1) return left;
        return depth(root.right, val, d + 1);
    }
}
