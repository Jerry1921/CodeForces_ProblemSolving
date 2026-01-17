import java.util.Scanner;

public class prob_1878A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] myArr = new int[n];

            for (int i = 0; i < n; i++){
                myArr[i] = sc.nextInt();
            }

            int matchCount = 0;
            for (int i = 0; i < n; i++){
                if (myArr[i] == k) {
                    matchCount++;
                }
            }
            //System.out.println(matchCount);
            if (matchCount >= 1){
                System.out.println("YES");
            }else System.out.println("NO");

        }
    }
}
