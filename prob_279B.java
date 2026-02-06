import java.util.Scanner;

public class prob_279B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
/*
        int bookCount = 0;
        for (int i = 1; i <= n; i++){
            int b = sc.nextInt();
            if (b <= t){
                bookCount++;
                t = t - b;
            }
        }
        System.out.println(bookCount);*/

        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int left = 0;
        int sum = 0;
        int maxBooks = 0;

        for (int right = 0; right < n; right++){
            sum = sum + a[right];

            while (sum > t){
                sum = sum - a[left];
                left++;
            }

            maxBooks = Math.max(maxBooks, right - left + 1);
        }

        System.out.println(maxBooks);


    }
}
