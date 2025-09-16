import java.util.Scanner;

public class prob_263A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //int[] matArray = new int[5];


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                int num = sc.nextInt();

                if (num == 1){
                    System.out.println(Math.abs(i-3) + Math.abs(j-3));
                    //return;

                }



            }

        }


    }
}
