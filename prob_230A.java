import java.util.Arrays;
import java.util.Scanner;

public class prob_230A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();

        int[][] myArr = new int[n][2];

        for (int i = 0; i < n; i++){
            myArr[i][0] = sc.nextInt(); // dragons strength
            myArr[i][1] = sc.nextInt(); // bonus
        }

        Arrays.sort(myArr, (a,b) -> Integer.compare(a[0], b[0]));





        //System.out.println(myArr[0][0]);

        //int defeatCount = 0;
        // Fight dragons in sorted order
        for (int i = 0; i < n; i++){
            if (s > myArr[i][0]){
                //defeatCount++;
                s += myArr[i][1];
            }else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");




        /*if (defeatCount == n){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }*/

    }
}
