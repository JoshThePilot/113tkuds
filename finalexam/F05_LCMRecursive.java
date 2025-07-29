import java.util.*;

public class F05_LCMRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = GCD(a, b);
        int lcm = a * b / gcd;
        System.out.println("LCM: " + lcm);
    }

    public static int GCD(int a, int b) {
        if (a == b) return a;
        return a > b ? GCD(a - b, b) : GCD(a, b - a);
    }
}

// 時間複雜度：O(max(a, b))
// 最壞情況每次只減一
