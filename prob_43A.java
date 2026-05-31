import java.util.Scanner;

public class prob_43A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int goalCountA = 0;
        int goalCountB = 0;

        String[] teams = new String[n];

        //System.out.println(A);


        for (int i = 0; i < n; i++){
            teams[i] = sc.next();
        }

        String teamA = teams[0];

        String teamB = "";

        for (int i = 0; i < n; i++){
            if (teams[i].equals(teamA)){
                goalCountA++;
            } else {
                teamB = teams[i];
                //goalCountB++;
            }
        }

        goalCountB = n - goalCountA;

        //System.out.println(goalCountB);

        //System.out.println(goalCountA);

        if (goalCountA > goalCountB){
            System.out.println(teamA);
        }else System.out.println(teamB);


    }
}
