import java.util.*;

public class F08_ClimbStairsMemo {
    static int[] memo = new int[41];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Arrays.fill(memo, -1);
        System.out.println("Ways: " + climb(n));
    }

    static int climb(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        if (memo[n] != -1) return memo[n];
        return memo[n] = climb(n - 1) + climb(n - 2) + climb(n - 3);
    }
}
