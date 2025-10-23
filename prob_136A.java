import java.util.Scanner;

public class prob_136A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] giveArr = new int[n + 1];

        for (int i = 1; i <= n; i++){
            int p = sc.nextInt();
            giveArr[p] = i;
        }

        for (int i = 1; i <= n; i++){
            System.out.print(giveArr[i] + " ");
        }
    }
}
