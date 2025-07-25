import java.util.*;

public class TreeReconstruction {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) inMap.put(inorder[i], i);
        return helper(preorder, 0, preorder.length - 1, 0, inorder.length - 1, inMap);
    }

    private static TreeNode helper(int[] pre, int ps, int pe, int is, int ie, Map<Integer, Integer> inMap) {
        if (ps > pe || is > ie) return null;
        TreeNode root = new TreeNode(pre[ps]);
        int inRoot = inMap.get(pre[ps]);
        int numsLeft = inRoot - is;
        root.left = helper(pre, ps + 1, ps + numsLeft, is, inRoot - 1, inMap);
        root.right = helper(pre, ps + numsLeft + 1, pe, inRoot + 1, ie, inMap);
        return root;
    }
}
