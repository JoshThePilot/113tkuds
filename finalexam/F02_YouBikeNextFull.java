import java.util.*;

public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(":");
            times[i] = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
        }

        String[] queryParts = sc.nextLine().split(":");
        int query = Integer.parseInt(queryParts[0]) * 60 + Integer.parseInt(queryParts[1]);

        int left = 0, right = n - 1;
        int ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (times[mid] > query) {
                ans = times[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (ans == -1) {
            System.out.println("No bike");
        } else {
            System.out.printf("%02d:%02d\n", ans / 60, ans % 60);
        }
    }
}

// 時間複雜度：O(1)
// 計算一次
