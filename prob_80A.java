import java.util.Scanner;

public class prob_80A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int myPrime = 0;

        for (int i = 1; i <= m-n; i++) {
//            if ((n+i) <= 1){
//                System.out.println("No");
//            }
            boolean prime = true;

            for (int j = 2; j <= Math.sqrt(n+i); j++){
                if ((n+i) % j == 0){
                    prime = false;
                    break;
                }
            }

            if (prime){
                myPrime = n + i;
                break;
            }

        }

        if (myPrime == m){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
