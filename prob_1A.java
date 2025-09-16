import java.util.Scanner;

public class prob_1A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        long m = sc.nextInt();

        long a = sc.nextInt();

       // we need to divide each length of the area by each length of the stone and
        // same as the width then multiply them

        // here we added (a-1) to n because we wanted the ceil value as we can't break
        // stones, we could have used math.ceil instead

        long totTiles = ((n+a-1)/a) * ((m+a-1)/a);

        System.out.println(totTiles);


    }
}
