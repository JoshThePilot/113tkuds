public class ArrayDemo {
    public static void main(String[] args) {
        double[] numbers = {1.5, 2.5, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            System.out.println("index: " + i);
            System.out.println("Memory Used:" + Double.BYTES + "bytes");
        }
    }
    
}
