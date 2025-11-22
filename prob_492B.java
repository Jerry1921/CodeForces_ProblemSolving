import java.util.Arrays;
import java.util.Scanner;

public class prob_492B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] myArr = new int[n];

        for (int i = 0; i < n; i++){
            myArr[i] = sc.nextInt();
        }

        Arrays.sort(myArr);


        double highestGap = 0;
        for (int i = 0; i < n-1; i++){
            double gap = myArr[i+1] - myArr[i];
            if (gap > highestGap){
                highestGap = gap;
            }
        }

        double leftEdgeGap = myArr[0] - 0;
        //System.out.println(leftEdgeGap);
        double rightEdgeGap = l - myArr[n-1];
        //System.out.println(rightEdgeGap);

        double minRadius = Math.max(leftEdgeGap,
                Math.max(rightEdgeGap, (highestGap/2)));


        //System.out.println(highestGap);

        //System.out.println(myArr[0]);

        System.out.println(minRadius);
    }
}
