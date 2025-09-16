import java.util.Scanner;

public class prob_281A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

       // System.out.println(word.charAt(0));

        char lowerCase = word.charAt(0);

        char upperCase = Character.toUpperCase(lowerCase);

        System.out.println(upperCase + word.substring((1)));

        /*String[] singleLetterArr = word.split("");

        String f = singleLetterArr[0].toUpperCase();

        //char uppercase1 = Character.toUpperCase(singleLetterArr[0]);

        System.out.println(f);

        word.charAt(0) = f;*/


    }
}
