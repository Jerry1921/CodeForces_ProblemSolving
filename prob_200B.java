import java.util.Scanner;

public class prob_200B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double proportion = ((double) 100 / n);

        //int[] container = new int[];

        double totalJuice = 0;

        for (int i = 0; i < n; i++){
            int container = sc.nextInt();
            totalJuice += ((container * proportion) / 100);
        }

        System.out.println(totalJuice);
    }
}
