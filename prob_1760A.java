import java.util.Arrays;
import java.util.Scanner;

public class prob_1760A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int[] myArr = new int[3];

            for (int i = 0; i < 3; i++){
                myArr[i] = sc.nextInt();

            }

            Arrays.sort(myArr);

            System.out.println(myArr[1]);
        }
    }
}
