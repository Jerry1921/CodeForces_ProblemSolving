import java.util.Scanner;

public class prob_158A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        int count = 0;

        int[] scores = new int[n];

        if (k>=1 && k<=n && n<=50){



        //String inputLine = sc.nextLine();

        //System.out.println("ok");

        for (int i = 0; i < n; i++) {

            scores[i] = sc.nextInt();

            //String[]


            /*if (scores[i]>k){
                int count = 0;
                count++;
                System.out.println(count);
            }*/


        }
        for (int j = 0; j<n; j++){
            if (scores[j]>=scores[k-1] && scores[j] >0){
                count++;
            }
        }
        }
        System.out.println(count);

        //System.out.println(scores[0]);
    }
}
