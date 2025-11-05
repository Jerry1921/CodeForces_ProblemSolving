import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class prob_208A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String myString = sc.nextLine();


        myString = myString.replace("WUB"," ");

        //System.out.println(myString.trim());

        // Trim extra spaces and split and insert to an array of String
        String[] words = myString.trim().split("\\s+");

        //System.out.println(words[0]);

        // Join the words with a space
        // for join method we need separator and elements
        System.out.println(String.join(" ", words));

        //List<String> words = new ArrayList<>();

        //while ()

        //List<String> words = Arrays.asList(myString.split(" "));

        //words.remove(" ");
        //words.replaceAll(" ","");

        //System.out.println(words);

        //System.out.println(myString);
    }
}
