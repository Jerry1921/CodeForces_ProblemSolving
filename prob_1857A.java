import java.util.Scanner;

public class prob_1857A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int[] myArr = new int[n];



            for (int i = 0; i < n; i++){
                myArr[i] = sc.nextInt();
            }

            int oddCount = 0;
            for (int number : myArr){
                if (number % 2 != 0){
                    oddCount++;
                }
            }
            if (oddCount % 2 == 0){
                System.out.println("YES");
            }else System.out.println("NO");

            // This method is okay but there is another method more good
           /* long sum = 0;

            for (int number : myArr){
                sum += number;
            }

            if (sum % 2 == 0){
                System.out.println("YES");
            }else System.out.println("NO");*/

            // when it says parity we need to find out the number of
            // Odd counts



        }
    }
}
