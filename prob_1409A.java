import java.util.Scanner;

public class prob_1409A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();



            /*if (a == b){
                System.out.println(moveCount);
            }if (a % b == 0){

            }
            if (a < b){
                moveCount = (b-a)/10 + 1;
                System.out.println(moveCount);
            }if (a > b){
                moveCount = (a-b)/10 + 1;
                System.out.println(moveCount);
            }*/

            int diff = Math.abs(a-b);
            int moveCount = (diff + 9)/ 10;
            System.out.println(moveCount);



        }
    }
}
