import java.util.ArrayList;
import java.util.Scanner;

public class prob_1475A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        /*for (int i = 0; i < t; i++){
            long n = sc.nextLong();

            ArrayList<Long> myArr = new ArrayList<>();
            for (long j = 1; j <= Math.sqrt(n); j++){
                if (n % j == 0){
                    myArr.add(j);
                }
                if (j != n/j){
                    myArr.add(n/j);
                }
            }
        }*/

        while (t-- > 0){
            long n = sc.nextLong();

            while (n % 2 == 0){
                n = n / 2;
            }

            if (n > 1){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

    }
}
