class ArrayAccess {
    public static void main(String[] args) {
        int[] scores = {85, 92, 77, 60, 88};
        int firstScore = scores[0];
        int lastScore = scores[4];
        int middleScore = scores[2];

        System.out.println("first score: " + firstScore);
        System.out.println("last score: " + lastScore);
        System.out.println("middle score: " + middleScore);

        scores[0] = 90;
        scores[scores.length - 1] = 95;

        int arrayLength = scores.length;

        System.out.println("\nnew array values:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("index %d : %d%n", i, scores[i]);
        }
    }
}
