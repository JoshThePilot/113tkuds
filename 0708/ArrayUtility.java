import java.util.Arrays;

public class ArrayUtility {
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] copyArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num < largest) {
                second = num;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] original = {3, 7, 1, 9, 4, 6, 8, 2, 5};
        System.out.println("原始陣列：");
        printArray(original);

        int[] copied = copyArray(original);
        System.out.println("複製陣列：");
        printArray(copied);

        reverseArray(original);
        System.out.println("反轉後的原始陣列：");
        printArray(original);

        int secondLargest = findSecondLargest(copied);
        System.out.println("第二大的數值是：" + secondLargest);
    }
}
