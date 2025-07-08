public class GradeProcessor {
    public static void main(String[] args) {
        int[] grades = {78, 85, 92, 67, 88, 95, 73, 90};

        int total = 0;
        int max = grades[0];
        int min = grades[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < grades.length; i++) {
            total += grades[i];

            if (grades[i] > max) {
                max = grades[i];
                maxIndex = i;
            }

            if (grades[i] < min) {
                min = grades[i];
                minIndex = i;
            }
        }

        double average = (double) total / grades.length;

        int aboveAverageCount = 0;
        for (int grade : grades) {
            if (grade > average) {
                aboveAverageCount++;
            }
        }

        System.out.println("total: " + total);
        System.out.printf("average: %.2f%n", average);
        System.out.println("max: " + max + " (student: " + maxIndex + ")");
        System.out.println("min: " + min + " (student: " + minIndex + ")");
        System.out.println("above Average: " + aboveAverageCount);

        System.out.println("\nall scores:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("student " + i + ": " + grades[i]);
        }
    }
}
