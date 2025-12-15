import java.util.Scanner;

public class prob_189A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /*int currentVal = 0;
        int countRibbon = 0;

        if (n >= a){
            currentVal = n - c;
            countRibbon++;
            if (currentVal >= 0){
                currentVal = currentVal - b;
                countRibbon++;
                if (currentVal >= 0){
                    currentVal = currentVal - a;
                    countRibbon++;
                }
            }
        }
        System.out.println(countRibbon-1);*/

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++){
            dp[i] = -1;
        }

        dp[0] = 0;

        for (int i = 1; i <= n; i++){
            if (i - a >= 0 && dp[i - a] != -1){
                dp[i] = Math.max(dp[i], dp[i-a] + 1);
            }
            if (i - b >= 0 && dp[i - b] != -1){
                dp[i] = Math.max(dp[i], dp[i-b] + 1);
            }
            if (i - c >= 0 && dp[i - c] != -1){
                dp[i] = Math.max(dp[i], dp[i-c] + 1);
            }
        }
        System.out.println(dp[n]);
    }
}
