import java.util.Scanner;

public class prob_750A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int timeLeft = 240 - k;
        int timeToSolve = 0;
        int score = 0;

        for (int i = 1; i <= n; i++){
            timeToSolve = 5 * i;

            if (timeToSolve <= timeLeft){
                score++;
            }
            timeLeft = timeLeft - timeToSolve;
        }

        System.out.println(score);
    }
}
