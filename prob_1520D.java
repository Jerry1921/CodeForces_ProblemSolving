import java.util.HashMap;
import java.util.Scanner;

public class prob_1520D {
    public static void main(String[] args) { // Fixed 'main' parameter to convention 'args'
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashMap<Long, Long> freq = new HashMap<>();
            long ans = 0;

            for (int i = 1; i <= n; i++) {
                long a = sc.nextLong();
                long key = a - i;

                // If the key already exists, it can form pairs with all its previous occurrences
                if (freq.containsKey(key)) {
                    ans += freq.get(key);
                }

                // Update the frequency of the key in the map
                freq.put(key, freq.getOrDefault(key, 0L) + 1);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}