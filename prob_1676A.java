import java.util.Scanner;

public class prob_1676A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++){
            String myString = sc.next();

            char[] c = myString.toCharArray();

            //System.out.println(c[0]);

            int sumOfFirstHalf = Integer.parseInt(String.valueOf(c[0])) +
                    Integer.parseInt(String.valueOf(c[1])) +
                    Integer.parseInt(String.valueOf(c[2]));

            int sumOfSecondHalf = Integer.parseInt(String.valueOf(c[3])) +
                    Integer.parseInt(String.valueOf(c[4])) +
                    Integer.parseInt(String.valueOf(c[5]));


            if (sumOfSecondHalf == sumOfFirstHalf){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }


            //System.out.println(sumOfFirstHalf);

            //int wholeInteger = Integer.parseInt(myString);

            //int last = wholeInteger % 1000;


        }


    }
}
