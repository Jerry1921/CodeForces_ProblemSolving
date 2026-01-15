import java.util.Scanner;

public class prob_451A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        /*if ((n * m) % 2 == 0){
            System.out.println("Malvika");
        }else {
            System.out.println("Akshat");
        }*/

        // need to find minimum moves
        int minMoves = Math.min(n, m);
        if (minMoves % 2 == 0){
            System.out.println("Malvika");
        }else {
            System.out.println("Akshat");
        }
    }
}
