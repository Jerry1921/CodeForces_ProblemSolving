import java.util.Scanner;

public class prob_151A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int totalDrinks = (k * l) / nl;
        int totalLime = c * d;
        int totalSalt = p / np;

        int minToasts = Math.min(totalDrinks, Math.min(totalLime, totalSalt));

        System.out.println(minToasts / n);


    }
}
