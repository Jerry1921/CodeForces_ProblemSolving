import java.util.Scanner;

public class prob_9A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int W = sc.nextInt();


        //Wrong approach
//        double myAns = ((6 - Math.max(Y, W)) + 1) / 6.0;
//
//
//        if (myAns == 0.5){
//            System.out.println("1/2");
//        } else if (myAns == 0.0) {
//            System.out.println("0/1");
//        } else if (myAns == 1.0) {
//            System.out.println("1/1");
//        }

        //System.out.println(myAns);

        int max = Math.max(Y, W);

        int favorable = (6 - max) + 1;

        if (favorable == 6){
            System.out.println("1/1");
        } else if (favorable == 5) {
            System.out.println("5/6");
        } else if (favorable == 4) {
            System.out.println("2/3");
        } else if (favorable == 3) {
            System.out.println("1/2");
        } else if (favorable == 2) {
            System.out.println("1/3");
        } else if (favorable == 1) {
            System.out.println("1/6");
        }

    }
}
