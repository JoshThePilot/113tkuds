import java.util.*;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(":");
            times[i] = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
        }
        String[] query = sc.nextLine().split(":");
        int q = Integer.parseInt(query[0]) * 60 + Integer.parseInt(query[1]);

        int left = 0, right = n;
        while (left < right) {
            int mid = (left + right) / 2;
            if (times[mid] <= q) left = mid + 1;
            else right = mid;
        }
        if (left == n) {
            System.out.println("No train");
        } else {
            int hr = times[left] / 60;
            int min = times[left] % 60;
            System.out.printf("%02d:%02d\n", hr, min);
        }
    }
}
// 時間複雜度：O(log n)
// 空間複雜度：O(n)
