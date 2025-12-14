import java.util.Arrays;
import java.util.Scanner;

public class prob_706B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] pricesOfShops = new int[n];
        for (int i = 0; i < n; i++){
            pricesOfShops[i] = sc.nextInt();
        }

        Arrays.sort(pricesOfShops);

        int q = sc.nextInt();

        while (q-->0){
            int canSpentCoins = sc.nextInt();

            int buyCount = upperBound(pricesOfShops, canSpentCoins);
            System.out.println(buyCount);

        }

    }

    static int upperBound(int[] arr, int target){
        int low = 0;
        int high = arr.length;

        while (low < high){
            int mid = (low+high)/2;
            if (arr[mid] <= target){
                low = mid + 1;
            }else {
                high = mid;
            }
        }
        return low;
    }
}
