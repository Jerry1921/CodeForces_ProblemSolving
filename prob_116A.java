import java.util.Scanner;

public class prob_116A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] myArr = new int[n][2];

        for (int i = 0; i < n; i++){
            myArr[i][0] = sc.nextInt();
            myArr[i][1] = sc.nextInt();
        }

        //System.out.println(myArr[0][1]);

        int current = 0;
        int maxCapacity = 0;

        for (int i = 0; i < n; i++){
            current -= myArr[i][0];
            current += myArr[i][1];
            if (current > maxCapacity){
                maxCapacity = current;
            }
        }

        System.out.println(maxCapacity);




    }
}
