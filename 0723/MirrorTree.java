class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}


public class MirrorTree {
    public static TreeNode mirror(TreeNode root) {
        if (root == null) return null;
        TreeNode left = mirror(root.left);
        TreeNode right = mirror(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
