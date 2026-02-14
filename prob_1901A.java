
import java.util.Scanner;

public class prob_1901A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] myArr = new int[n];

            for (int i = 0; i < n; i++){
                myArr[i] = sc.nextInt();
            }

            //Arrays.sort(myArr);

            int maxDist = myArr[0];

            for (int i = 1; i < n; i++){
                maxDist = Math.max(maxDist, (myArr[i] - myArr[i-1]));
            }

            System.out.println(Math.max(maxDist, 2 * (x - myArr[n-1])));


        }
    }
}
