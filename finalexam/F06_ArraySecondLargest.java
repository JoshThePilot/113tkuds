import java.util.*;

public class F06_ArraySecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] res = findSecondMax(arr, 0, n - 1);
        System.out.println("SecondMax: " + res[1]);
    }

    public static int[] findSecondMax(int[] arr, int l, int r) {
        if (l == r) return new int[]{arr[l], Integer.MIN_VALUE};
        int mid = (l + r) / 2;
        int[] left = findSecondMax(arr, l, mid);
        int[] right = findSecondMax(arr, mid + 1, r);

        int max = Math.max(left[0], right[0]);
        int second = Math.max(Math.min(left[0], right[0]), Math.max(left[1], right[1]));
        return new int[]{max, second};
    }
}

// 時間複雜度：O(n)
// 單趟遍歷找最大值與大二大值
