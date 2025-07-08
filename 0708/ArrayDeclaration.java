public class ArrayDeclaration {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[5];

        int[] grades = new int[5];

        int[] numbers = {85, 92, 77, 60, 88};

        @SuppressWarnings("unused")
        int[] values = new int[]{10, 20, 30, 40, 50};

        System.out.println("all length of array");
        System.out.println("new: " + scores.length);
        System.out.println("grades: " + grades.length);
        System.out.println("numbers: " + numbers.length);
        System.out.println("values: " + values.length);
    }
    
}
