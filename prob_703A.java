import java.util.Scanner;

public class prob_703A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mWin = 0;
        int cWin = 0;

        for (int i = 0; i < n; i++){
            int m = sc.nextInt();
            int c = sc.nextInt();

            if (m > c){
                mWin++;
            } else if (m < c) {
                cWin++;
            }
        }

//        System.out.println(mWin);
//        System.out.println(cWin);

        if (mWin > cWin){
            System.out.println("Mishka");
        } else if (cWin > mWin) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
    }
}
