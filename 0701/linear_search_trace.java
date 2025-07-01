import java.util.Scanner;

public class linear_search_trace {
    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9};

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("輸入要搜尋的數字：");
            int target = scanner.nextInt();
            
            boolean found = false;
            for (int i = 0; i < data.length; i++) {
                System.out.println("比對中：" + target + " vs " + data[i]);
                if (data[i] == target) {
                    found = true;
                    break;
                }
            }
            
            if (found) {
                System.out.println("結果：找到");
            } else {
                System.out.println("結果：沒找到");
            }
        }
    }
}
