import java.util.Scanner;

public class prob_2171A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            System.out.println(solve(n));
        }


    }

    public static int solve(int n){
        if (n % 2 == 1){
            return 0;
        }

        int m = n / 2;

        return (m / 2) + 1;
    }
}
