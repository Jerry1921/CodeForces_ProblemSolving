import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class prob_158B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*int n = sc.nextInt();

        *//*int carSeat = 4;
        int carCount = 0;*//*

        int[] myArr = new int[n];

        for (int i = 0; i < n; i++){
            myArr[i] = sc.nextInt();

        }

        int sum = IntStream.of(myArr).sum();

        int carCount = Math.ceilDiv(sum,4);

        System.out.println(carCount);*/

        int n = sc.nextInt();
        int[] count = new int[5];


        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            count[x]++;
        }

        int taxis = 0;

        // All the 4's are in single single taxi
        taxis += count[4];

        // Then figure out about the 3's and 1's
        taxis += count[3];
        count[1] = Math.max(0, count[1] - count[3]);

        // now lets define the pairs of 2's
        taxis += count[2] / 2;
        count[2] = count[2] % 2;

        if (count[2] == 1){
            taxis++;
            count[1] = Math.max(0, count[1] -2);

        }

        // for the remaining groups
        if (count[1] > 0){
            taxis += (count[1] + 3) / 4;
        }

        System.out.println(taxis);




    }
}
