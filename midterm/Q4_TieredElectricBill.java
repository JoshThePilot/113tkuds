import java.util.*;

public class Q4_TieredElectricBill {
    public static int calc(int kWh) {
        int sum = 0;
        int[] limits = {120, 210, 170, 200, 300};
        double[] prices = {1.68, 2.45, 3.70, 5.04, 6.24, 8.46};
        int[] usage = new int[6];

        for (int i = 0; i < 5; i++) {
            if (kWh > limits[i]) {
                usage[i] = limits[i];
                kWh -= limits[i];
            } else {
                usage[i] = kWh;
                kWh = 0;
                break;
            }
        }
        usage[5] = kWh;

        for (int i = 0; i < 6; i++) {
            sum += Math.round(usage[i] * prices[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for (int i = 0; i < n; i++) {
            int kWh = sc.nextInt();
            int bill = calc(kWh);
            System.out.println("Bill: $" + bill);
            total += bill;
        }
        System.out.println("Total: $" + total);
        System.out.println("Average: $" + Math.round((double) total / n));
    }
}
// 時間複雜度：O(n)
// 空間複雜度：O(1)
