import java.util.Scanner;

public class prob_432A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] myArr = new int[n];

        int totalCount = 0;

        for (int i = 0; i < n; i++){
            myArr[i] = sc.nextInt();

            if (5 - myArr[i] >= k){
                totalCount++;
            }
        }

        System.out.println(totalCount / 3);

//        for (int j = 0; j < n; j++){
//            System.out.println(myArr[j]);
//        }
    }
}
