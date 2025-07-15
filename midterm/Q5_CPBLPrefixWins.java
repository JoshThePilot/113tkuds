import java.util.*;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] ps = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            ps[i + 1] = ps[i] + a[i];
        }
        int k = sc.nextInt();
        System.out.print("PrefixSum:");
        for (int i = 1; i <= k; i++) {
            System.out.print(" " + ps[i]);
        }
        System.out.println();
    }
}
// 時間複雜度：O(n)
// 空間複雜度：O(n)