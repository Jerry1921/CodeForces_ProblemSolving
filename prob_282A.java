import java.util.Scanner;

public class prob_282A {
    public static void main(String[] args){


        int x = 0;

        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();
        sc.nextLine();

        for (int j = 0; j<inputNum; j++) {

            String inputStatement = sc.nextLine();


            if (inputStatement.equals("++x")) {
                x = +1;
            } else if (inputStatement.equals("x++")) {
                x = +1;

            } else if (inputStatement.equals("x--")) {
                x -= 1;
            } else if (inputStatement.equals("--x")) {
                x -= 1;
            }else System.out.println("default value");

            System.out.println(x);
        }


    }
}
