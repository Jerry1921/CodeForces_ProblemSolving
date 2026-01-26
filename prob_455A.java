import java.util.Scanner;

public class prob_455A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        /*int[] myArr = new int[n];
        for (int i = 0; i < n; i++){
            myArr[i] = sc.nextInt();
        }*/

        int max = 0;
        int[] count = new int[100001];

        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            count[x]++; // her we put the frequency of each of the number
            if (x > max){
                max = x; // max is needed for the dp loop to end within max
            }
        }

        long[] dp = new long[max + 1];

        dp[1] = (long) count[1] * 1;

        for (int i = 2; i <= max; i++){

            long take = dp[i - 2] + (long) i * count[i];

            long skip = dp[i - 1];

            dp[i] = Math.max(take, skip);
        }

        System.out.println(dp[max]);


    }
}
