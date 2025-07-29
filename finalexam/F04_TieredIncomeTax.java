import java.util.*;

public class F04_TieredIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] income = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            income[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int tax = calcTax(income[i]);
            total += tax;
            System.out.println("Tax: $" + tax);
        }

        System.out.println("Average: $" + (total / n));
    }

    public static int calcTax(int income) {
        int tax = 0;
        if (income <= 560000) tax = (int)(income * 0.05);
        else if (income <= 1260000) tax = (int)(income * 0.12 - 39200);
        else if (income <= 2520000) tax = (int)(income * 0.20 - 140000);
        else if (income <= 4720000) tax = (int)(income * 0.30 - 392000);
        else tax = (int)(income * 0.40 - 864000);
        return tax;
    }
}

// 時間複雜度：O(n)
// 利用逐一比對法
