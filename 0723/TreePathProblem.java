import java.util.*;

public class TreePathProblem {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) dfs(root, "", paths);
        return paths;
    }

    private static void dfs(TreeNode node, String path, List<String> paths) {
        if (node.left == null && node.right == null) {
            paths.add(path + node.val);
        }
        if (node.left != null) dfs(node.left, path + node.val + "->", paths);
        if (node.right != null) dfs(node.right, path + node.val + "->", paths);
    }
}
