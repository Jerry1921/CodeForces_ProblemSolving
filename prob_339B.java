import java.util.Scanner;

public class prob_339B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] myArr = new int[m];

        for (int i = 0; i < m; i++){
            myArr[i] = sc.nextInt();
        }

        long time = myArr[0] - 1;

        for (int i = 1; i < m; i++){
            if (myArr[i] < myArr[i-1]){
                time = time + n - (myArr[i-1]-myArr[i]);
            }else {
                time = time + (myArr[i] - myArr[i-1]);
            }
        }

        //System.out.println(myArr[0]);
        System.out.println(time);
    }
}
