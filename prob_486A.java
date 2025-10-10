import java.util.Scanner;

public class prob_486A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long sumResult = 0;

        if (n%2 == 0){
            sumResult = n/2;
        }else {
            sumResult = -(n+1)/2;
        }



        System.out.println(sumResult);
    }
}
