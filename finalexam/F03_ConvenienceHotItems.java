import java.util.*;

public class F03_ConvenienceHotItems {
    static class Item {
        String name;
        int qty;
        Item(String name, int qty) {
            this.name = name;
            this.qty = qty;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int qty = sc.nextInt();
            items[i] = new Item(name, qty);
        }

        for (int i = 1; i < n; i++) {
            Item key = items[i];
            int j = i - 1;
            while (j >= 0 && items[j].qty < key.qty) {
                items[j + 1] = items[j];
                j--;
            }
            items[j + 1] = key;
        }

        for (int i = 0; i < Math.min(10, n); i++) {
            System.out.println(items[i].name + " " + items[i].qty);
        }
    }
}

// 時間複雜度：O(n^2) 最差情況
// 依據銷量排序 原式為O(n log n)
