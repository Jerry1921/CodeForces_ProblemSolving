import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prob_443A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String myString = sc.nextLine();

        myString = myString.replace("}","")
                .replace("{","")
                .replace(",","")
                .replace(" ","");

        Set<Character> characterSet = new HashSet<>();

        for (char c : myString.toCharArray()){
            characterSet.add(c);
        }

        System.out.println(characterSet.size());


        //System.out.println(myString);
    }
}
