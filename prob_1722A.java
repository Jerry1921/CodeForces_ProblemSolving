import java.util.Arrays;
import java.util.Scanner;

public class prob_1722A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            if (n != 5){
                System.out.println("NO");
                continue;
            }

            char[] a = s.toCharArray();
            char[] b = "Timur".toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if (Arrays.equals(a,b)){
                System.out.println("YES");
            }else System.out.println("NO");


        }
    }
}
