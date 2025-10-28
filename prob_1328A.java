import java.util.Scanner;

public class prob_1328A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int count = 0;

        int[] myArr = new int[2];



        for (int i = 0; i < t; i++){
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a % b == 0){
                System.out.println(0);
            }else {
                long rem = a % b;
                long x = b - rem;
                System.out.println(x);
            }

        }

    }
}
