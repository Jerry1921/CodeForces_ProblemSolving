import java.util.Scanner;

public class dummy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();
        //sc.nextLine();

        //String num = sc.nextLine();

        int x = 0;

        for (int j = 0; j < inputNum; j++) {




            String inputStatement = sc.next();

            if (inputStatement.equals("++x") || inputStatement.equals("x++") || inputStatement.equals("++X") || inputStatement.equals("X++")) {
                x = x+1;
            }
           else if (inputStatement.equals("--x") || inputStatement.equals("x--") || inputStatement.equals("--X") || inputStatement.equals("X--")) {
                x = x-1;
                //break;
            } /*else {
                System.out.println("default value");
            }*/



        }
        System.out.println(""+x);

    }
}


