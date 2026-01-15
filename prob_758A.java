import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class prob_758A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] myArr = new int[n];

        for (int i = 0; i < n; i++){
            myArr[i] = sc.nextInt();
        }

        Arrays.sort(myArr);

        int totalBurles = 0;
        int dif = 0;

        for (int j = 0; j < n; j++){
            dif = myArr[n-1] - myArr[j];
            totalBurles += dif;
        }

        System.out.println(totalBurles);

        //System.out.println(myArr[4]);


    }
}
