public class ArraySearcher {
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};
        int[] testValues = {67, 100};

        for (int value : testValues) {
            int index = findElement(numbers, value);
            int occurrences = countOccurrences(numbers, value);

            if (index != -1) {
                System.out.println("number " + value + " is in index: " + index);
            } else {
                System.out.println("number " + value + " was not found");
            }

            System.out.println("number " + value + " occurred: " + occurrences);
            System.out.println("--");
        }
    }
}
