import java.util.Scanner;

public class prob_1791C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        while (t-- > 0){
            int n = sc.nextInt();
            String myString = sc.next();


            /*int countDismiss = 0;
            for (int i = 0; i <= n/2; i++){
                for (int j = n-1; j >= n/2; j--){

                   if (myString.charAt(i) != myString.charAt(j)){
                       countDismiss++;
                   }
                    //System.out.println(countDismiss);
                }
            }
            System.out.println(n - countDismiss*2);*/

            int l = 0;
            int r = n - 1;

            while (l < r && myString.charAt(l) != myString.charAt(r)){
                l++;
                r--;
            }
            System.out.println(r - l + 1);

        }
    }
}
