import java.util.Arrays;
import java.util.Scanner;

public class prob_34B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] myArr = new int[n];

        for (int i = 0; i < n; i++){
            myArr[i] = sc.nextInt();
        }

        Arrays.sort(myArr);

//        for (int i = 0; i < n; i++){
//            System.out.println(myArr[i]);
//        }

        int sumOfMoney = 0;
        for (int i = 0; i < m; i++){
            if (myArr[i] < 0){
                sumOfMoney += Math.abs(myArr[i]);
            }
        }
        System.out.println(sumOfMoney);


    }
}
