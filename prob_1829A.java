import java.util.Arrays;
import java.util.Scanner;

public class prob_1829A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] myArr = new int[n];
            for (int i = 0; i < n; i++){
                myArr[i] = sc.nextInt();
            }

            int zeroCount = 0;
            int maxZeroCount = 0;
            //int[] zeroArr = new int[n];

            for (int i = 0; i < n; i++){
                if (myArr[i] == 0){
                    zeroCount++;
                    maxZeroCount = Math.max(maxZeroCount, zeroCount);
                    //zeroArr[i] = zeroCount;
                } else if (myArr[i] == 1) {
                    zeroCount = 0;
                }

            }
            /*Arrays.sort(zeroArr);
            System.out.println(zeroArr[n]);*/
            System.out.println(maxZeroCount);
        }
    }
}
