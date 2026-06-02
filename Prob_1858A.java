import java.util.Scanner;

public class Prob_1858A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

//            if ((a+b+c)%2 == 0){
//                System.out.println("Second");
//            }else {
//                System.out.println("First");
//            }

            int first = a + (c + 1)/2;
            int second = b + (c / 2);

            if (first > second){
                System.out.println("First");
            }else System.out.println("Second");
        }
    }
}
