import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prob_490A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> ones = new ArrayList<>();
        List<Integer> twos = new ArrayList<>();
        List<Integer> threes = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            int x = sc.nextInt();
            if (x == 1){
                ones.add(i);
            }
            if (x == 2){
                twos.add(i);
            }
            if (x == 3){
                threes.add(i);
            }
        }

        int teams = Math.min(ones.size(),Math.min(twos.size(), threes.size()));

        if (teams == 0){
            System.out.println(0);
        }

        for (int i = 0; i < teams; i++){
            System.out.println(ones.get(i) + " " +
                    twos.get(i) + " " +
                    threes.get(i));
        }


        /*int[] myArr = new int[n];

        for (int i = 0; i < n; i++){
            myArr[i] = sc.nextInt();
        }

        int allCount = 0;
        for (int i = 0; i < n; i++){
            if (myArr[i] == 1){
                allCount++;
            }
            if (myArr[i] == 2){
                allCount++;
            }
            if (myArr[i] == 3){
                allCount++;
            }
        }*/


        //String myString = myArr.toString();
        //System.out.println(myString);

    }
}
