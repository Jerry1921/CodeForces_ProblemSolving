import java.util.Scanner;

public class prob_1985A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            String S1 = sc.next();
            String S2 = sc.next();

            //System.out.println(S2);

            char firstLetterS1 = S1.charAt(0);
            char firstLetterS2 = S2.charAt(0);

            //System.out.println(firstLetterS1);
            //System.out.println(firstLetterS2);

            System.out.println(firstLetterS2 + S1.substring(1,3)
            + " " + firstLetterS1 + S2.substring(1,3));


        }


    }
}
