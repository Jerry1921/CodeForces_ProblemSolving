import java.util.Scanner;

public class prob_2145A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        int minCandies = 0;
        
        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            /*if (n < 9){
                minCandies = 9 - n;
                System.out.println(minCandies);
            } else if (n > 9) {
                if (n % 3 == 1){
                    minCandies = 2;
                    System.out.println(minCandies);
                } else if (n % 3 == 2) {
                    minCandies = 1;
                    System.out.println(minCandies);
                    
                } else if (n % 3 == 0) {
                    System.out.println(0);

                }*/
            int remainder = n % 3;

            if (remainder == 0){
                System.out.println(0);
            }else {
                System.out.println(3 - remainder);
            }
        }
        sc.close();

    }
}
