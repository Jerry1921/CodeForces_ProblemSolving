import java.util.Scanner;

public class prob_1903A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] myArr = new int[n];

            for (int j = 0; j < n; j++){
                myArr[j] = sc.nextInt();
            }

            if (k >= 2){
                System.out.println("YES");
                continue;
            }

            boolean sorted = true;

            for (int j = 0; j < n - 1; j++){
                if (myArr[j] > myArr[j + 1]){
                    sorted = false;
                    break;
                }
            }

            if (sorted){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
}
