import java.util.Scanner;

public class prob_1873A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        while (t -- > 0){

            //int unmatched = 0;

            String cards = sc.next();
            //char[] myCards = cards.toCharArray();

            /*if (myCards[0] != 'a'){
                unmatched++;
            } else if (myCards[1] != 'b') {
                unmatched++;
            } else if (myCards[2] != 'c') {
                unmatched++;
            }

            if (unmatched > 2){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }*/

            if (cards.equals("abc")||
                    cards.equals("bac") ||
                    cards.equals("acb") ||
                    cards.equals("cba")){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
