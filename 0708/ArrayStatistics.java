public class ArrayStatistics {

    public static void main(String[] args) {
        int[] data = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};

        int sum = 0;
        int max = data[0], min = data[0];
        int maxIndex = 0, minIndex = 0;
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < data.length; i++) {
            int num = data[i];
            sum += num;

            if (num > max) {
                max = num;
                maxIndex = i;
            }

            if (num < min) {
                min = num;
                minIndex = i;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        double average = (double) sum / data.length;

        int aboveAverageCount = 0;
        for (int num : data) {
            if (num > average) {
                aboveAverageCount++;
            }
        }

        System.out.println("========= 陣列統計分析結果 =========");
        System.out.printf("%-15s : %d%n", "總和", sum);
        System.out.printf("%-15s : %.2f%n", "平均值", average);
        System.out.printf("%-15s : %d (索引 %d)%n", "最大值", max, maxIndex);
        System.out.printf("%-15s : %d (索引 %d)%n", "最小值", min, minIndex);
        System.out.printf("%-15s : %d%n", "大於平均的數量", aboveAverageCount);
        System.out.printf("%-15s : %d%n", "偶數數量", evenCount);
        System.out.printf("%-15s : %d%n", "奇數數量", oddCount);
        System.out.println("===================================");
    }
}
