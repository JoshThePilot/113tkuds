import java.util.Random;

public class ds_06 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        System.out.print("陣列元素：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("最大值是：" + max);
    }
}
