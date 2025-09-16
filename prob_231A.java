import java.util.ArrayList;
import java.util.*;

import java.util.Scanner;

public class prob_231A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();

        int count = 0;

        for (int i = 0; i<inputNum; i++){
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();

            int sum = p+v+t;

            if (sum>=2){
                count++;

            }

        }

        /*while (inputNum -- > 0){
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();

            int sum = p+v+t;

            if (sum>=2){
                count++;

            }*/
        //}
        System.out.print(count);

    }
}

