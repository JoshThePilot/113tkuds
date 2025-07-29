import java.util.*;

public class F07_AnagramPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        int[] freq = new int[26];

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                freq[c - 'a']++;
            }
        }

        int oddCount = 0;
        for (int count : freq) {
            if (count % 2 == 1) oddCount++;
        }

        System.out.println(oddCount <= 1 ? "Possible" : "Impossible");
    }
}
