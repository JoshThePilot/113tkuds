import java.util.*;

public class Q9_FindFiveStarStalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
            if (scores[i] == 5) result.add(i);
        }
        if (result.isEmpty()) System.out.println("None");
        else {
            for (int i = 0; i < result.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(result.get(i));
            }
            System.out.println();
        }
    }
}
