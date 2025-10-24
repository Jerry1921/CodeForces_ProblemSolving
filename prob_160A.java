import java.util.Arrays;
import java.util.Scanner;

public class prob_160A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] coins = new int[n];

        for (int i = 0; i < n; i++){
            coins[i] = sc.nextInt();
        }

        // Sorting the array
        Arrays.sort(coins);

        int totalSum = Arrays.stream(coins).sum();
        int mySum = 0;
        int coinCount = 0;

        for (int i = n-1; i >= 0; i--){
            mySum += coins[i];
            coinCount++;
            if (mySum > totalSum - mySum){
                break;
            }
        }
        System.out.println(coinCount);

        //System.out.println(coins[0]);
    }

}
