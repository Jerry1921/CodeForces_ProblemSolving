import java.util.*;
import java.util.stream.Stream;

public class prob_520A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String mainWord = sc.next();

        //String lowerCaseMainWord = mainWord.toLowerCase();

        /*if (mainWord.toLowerCase().contains("abcdefghijklmnopqrstwuvxyz")){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }*/

        ArrayList<Character> characterArrayList = new ArrayList<>();

        for (char i : mainWord.toLowerCase().toCharArray()){
            characterArrayList.add(i);
        }

        Set<Character> charSet = new HashSet<>();

        for (char c : characterArrayList){
            charSet.add(c);
        }

        if (charSet.size() == 26){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

        /*List<String> checkList = Arrays.asList("a","b","c","d","e",
                "f","g","h","i","j","k","l","m","n","o","p","q","r","s","t",
                "u","v","w","x","y","z");

        System.out.println(characterArrayList);*/

       /* if (characterArrayList.containsAll(checkList)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
*/
        /*char[] charArr = mainWord.toCharArray();

        if (Arrays.asList(charArr).contains("abcdefghijklmnopqrstwuvxyz")){

        }


        for (char c : charArr){
            if ()
        }*/

        //System.out.println(charArr);
    }
}
