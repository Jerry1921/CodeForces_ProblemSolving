import java.util.Scanner;

public class prob_1512A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int[] myArr = new int[n];

            for (int i = 0; i < n; i++){
                myArr[i] = sc.nextInt();
            }

            int common;
            if (myArr[0] == myArr[1] || myArr[0] == myArr[2]){
                common = myArr[0];
            }else {
                common = myArr[1];
            }

            for (int i = 0; i < n; i++){
                if (myArr[i] != common){
                    System.out.println(i + 1);
                    break;
                }
            }



        }
    }
}
