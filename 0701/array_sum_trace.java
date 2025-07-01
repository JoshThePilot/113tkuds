public class array_sum_trace {
    public static void main(String[] args) {
        
        int[] numbers = {5, 8, 3, 7, 2};
        int sum = 0;

        System.out.println("加總過程：");

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("加上第 " + (i + 1) + " 個元素（" + numbers[i] + "）後，總和為：" + sum);
        }

        System.out.println("所有元素總和：" + sum);
    }
}
