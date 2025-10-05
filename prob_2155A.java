import java.util.Scanner;

public class prob_2155A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int teams = sc.nextInt();
            int totalMatches = 2 * (teams - 1);
            System.out.println(totalMatches);
        }

        sc.close();
    }
}
