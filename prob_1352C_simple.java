import java.util.Scanner;

public class prob_1352C_simple {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int cnt = 0;
            int num = 0;

            while (cnt != k){
                num++;
                if (num % n != 0){
                    cnt++;
                }

            }
            System.out.println(num);
        }
    }
}
