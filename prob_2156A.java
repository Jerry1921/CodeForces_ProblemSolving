import java.util.Scanner;

public class prob_2156A {



    public static void main(String[] args) {
        //makeThreeGroup(10);
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            long n = sc.nextLong(); // number of slices
            long haoEats = (n - 1) / 2; // formula
            System.out.println(haoEats);
        }

        sc.close();
    }

}
