import java.util.Arrays;
import java.util.Scanner;

public class prob_1399A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int[] myArr = new int[n];
            boolean possibility = true;

            for (int l = 0; l < n; l++){
                myArr[l] = sc.nextInt();
            }

            Arrays.sort(myArr);

            for (int j = 1; j < n; j++){
                    if (Math.abs(myArr[j]-myArr[j - 1]) > 1){
                        possibility = false;
                        break;
                    }
                }

            if (possibility){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
