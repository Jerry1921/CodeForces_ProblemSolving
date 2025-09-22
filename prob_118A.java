import java.util.Scanner;

public class prob_118A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String inp = sc.nextLine();

       /* inp = inp.replace('a',' ');
        inp = inp.replace('e',' ');
        inp = inp.replace('i',' ');
        inp = inp.replace('o',' ');
        inp = inp.replace('u',' ');


*/

        inp = inp.toLowerCase();

        inp = inp.replaceAll("[AEIOUYaeiouy]","");

       // System.out.println(inp);



        //System.out.println(inp[0]);

       /* for (int i = 0; i< inp.length(); i++){
            //System.out.println(inp.charAt(i));
            if (inp.charAt(i) == 'a'){
                inp = inp.replace('a','.');
            } else if (inp.charAt(i) == 'e'){
                inp = inp.replace('e','.'); {

            }

        }*/
        //System.out.println(inp);

        // StringBuilder is the type of mutable String
        StringBuilder result = new StringBuilder();

        // Add '.' before each consonant
        for (int i = 0; i < inp.length(); i++){
            result.append('.');
            result.append(inp.charAt(i));
        }

        // Need to convert it by toString()
        System.out.println(result.toString());








    }
}
