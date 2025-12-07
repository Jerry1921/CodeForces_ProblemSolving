import java.util.Scanner;

public class prob_1692A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        for (int i = 0; i < t; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();


            int count = 0;


            if (a<b){
                count++;
            }
            if (a<c) {
                count++;
            }
            if (a<d) {
                count++;
            }

            System.out.println(count);

            /*int[] myArr = new int[4];
            myArr[i] = sc.nextInt();

            for (int j = 0; j < 3; j++){
                if (myArr[0] < myArr[1]){
                    count++;
                } else if (myArr[0] < myArr[2]) {
                    count++;
                } else if (myArr[0] < myArr[3]) {
                    count++;
                }
            }*/


            //System.out.println(count);

        }
    }
}
