import java.util.Scanner;

public class prob_1343B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            if ((n / 2) % 2 == 0){
                System.out.println("YES");

                int evenSum = 0;
                int oddSum = 0;

                //First half: even numbers
                for (int i = 1; i <= (n/2); i++){
                    int num = i * 2;
                    evenSum += num;
                    System.out.print(num + " ");
                }

                // Second half : first (n/2) - 1 odd numbers
                for (int i = 1; i <= ((n/2)-1); i++){
                    int num = (2 * i) - 1;
                    oddSum += num;
                    System.out.print(num + " ");
                }

                // Last balancing number
                System.out.println(evenSum - oddSum);
            }else System.out.println("NO");
        }
    }
}
