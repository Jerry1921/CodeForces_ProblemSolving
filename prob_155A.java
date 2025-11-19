import java.util.Scanner;

public class prob_155A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] myArr = new int[n];

        for (int i = 0; i < n; i++){
            myArr[i] = sc.nextInt();
        }

        int maxValue = 0;
        int minValue = 0;
        int amazingCount = 0;

       /* for (int i = 0; i < n; i++){
            for (int j = 1; j < n; j++){
                if (myArr[i] > myArr[j]){
                    maxValue = myArr[i];
                    minValue = myArr[j];
                    amazingCount++;
                }
            }
        }*/


            maxValue = myArr[0];
            minValue = myArr[0];


        for (int i = 1; i < n; i++){
            if (myArr[i] > maxValue){
                maxValue = myArr[i];
                amazingCount++;
            }
            if (myArr[i] < minValue){
                minValue = myArr[i];
                amazingCount++;
            }
        }

        System.out.println(amazingCount);
    }
}
