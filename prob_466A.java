import java.util.Scanner;

public class prob_466A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        //int dif = 1;
        /*int countOfM = 0;

        while (n > 1){
            n = n - m;
            countOfM++;
        }

        int totalCost = countOfM * b;

        if (n == 0){
            System.out.println(totalCost);
        }else {
            System.out.println(totalCost + a);
        }*/


        //System.out.println(totalCost);

        //System.out.println(n);
        //System.out.println(countOfM);


        // We need to check every possibility
        int cost1 = n * a; // buying all with single
        int cost2 = (n / m) * b + (n % m) * a; // buying bundles + leftover into single
        int cost3 = ((n / m) + 1) * b; //buying an extra bundle as sometimes its cheper than single ones

        int smallestCost = Math.min(cost1, Math.min(cost2, cost3));

        System.out.println(smallestCost);
    }
}
