import java.util.Scanner;

public class prob_580A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] seq = new int[n];

        //int count = 0;

        for (int i = 0; i < n; i++){
            seq[i] = sc.nextInt();

        }

        int current = 1;
        int longest = 1;

        for (int i = 1; i < n; i++){

                if (seq[i] >= seq[i-1]){
                    current++;
                    if (current > longest){
                        longest = current;
                    }
                }else {
                    current = 1;
                }
            }

        System.out.println(longest);


        //System.out.println(count);
    }
}
