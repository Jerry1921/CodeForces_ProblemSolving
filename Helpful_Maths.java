import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*String input = sc.nextLine();

        String digits = input.replaceAll("[+]", "");

        int onlyInteger = Integer.parseInt(digits);

        //System.out.println(onlyInteger);

        int last_digit = onlyInteger % 10;

        //System.out.println(last_digit);

        int normal = onlyInteger / 10;

        int middle_digit = normal % 10;

        //System.out.println(middle_digit);

        int normal2 = onlyInteger / 100;

        int first_digit = normal2 % 10;

        //System.out.println(first_digit);


        if (first_digit>=middle_digit && first_digit>=last_digit){
            if (middle_digit>=last_digit) {
                System.out.println( last_digit + "+" + middle_digit + "+" + first_digit);
            } else if (middle_digit>=first_digit && middle_digit>=last_digit) {
                if(first_digit>=last_digit){
                    System.out.println(  last_digit+ "+" + first_digit + "+" + middle_digit);
                }

            }
            else if (last_digit>=first_digit && last_digit>=middle_digit) {
                if(middle_digit >= first_digit){
                    System.out.println( first_digit + "+" + middle_digit + "+" + last_digit);
                }

            }
        }*/

        String first1 = sc.next();

        first1 = first1.replace("+","");

        char[] arr = first1.toCharArray();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);

            if (i == arr.length - 1)
                continue;
            System.out.print("+");
        }



    }
}
