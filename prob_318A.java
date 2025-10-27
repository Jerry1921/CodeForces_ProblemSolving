import java.util.Scanner;

public class prob_318A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



       /* int oddValue = 1;

        int evenValue = 2;

        int[] myArr = new int[n];

        int oddCount = (n + 1) / 2;


        //while (oddValue <= n)
        for (int i = 0; i < oddCount; i++){

            myArr[i] = oddValue ;
            oddValue += 2;
        }

        for (int i = oddCount; i < n; i++){

            myArr[i] = evenValue ;
            evenValue += 2;
        }

        *//*for (int i = 0; i < n; i++){
            System.out.println(myArr[i]);
        }

        System.out.println(" ");*//*

        System.out.println(myArr[k-1]);
        */
        long n = sc.nextLong();

        long k = sc.nextLong();

        long oddCount = (n + 1) / 2;

        if (k <= oddCount){
            System.out.println(2 * k - 1);
        }else {
            System.out.println(2 * (k - oddCount));
        }
    }
}
