import java.util.Arrays;
import java.util.Scanner;

public class prob_405A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] myArr = new int[n];

        for (int i = 0; i < n; i++){
            myArr[i] = sc.nextInt();
        }

        //Arrays.stream(myArr).sorted();

        Arrays.sort(myArr);

        for (int i = 0; i < n; i++){
            System.out.print(myArr[i]+" ");
        }


    }
}
