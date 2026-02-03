import java.util.Scanner;

public class prob_514A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String x = sc.next();

        char[] digits = x.toCharArray();

        //System.out.println(9 - (myCharArr[1] - '0'));
        //System.out.println(9 - (myCharArr[0] - '0'));

        for (int i = 0; i < digits.length; i++){
            int d = digits[i] - '0';
            int nd = 9 - d;

            if (i == 0 && nd == 0){
                continue;
            }

            if (nd < d){
                digits[i] = (char) (nd + '0');
            }
        }
        System.out.println(new String(digits));


    }
}
