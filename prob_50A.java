import java.util.Scanner;

public class prob_50A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float M = sc.nextInt();

        float N = sc.nextInt();

        double domino = Math.floor(M*N)/2;

        int myInt = (int) domino;

        System.out.println(myInt);
    }
}
