import java.util.ArrayList;
import java.util.Scanner;

public class prob_61A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*ArrayList<Integer> firstArr = new ArrayList<>();

        ArrayList<Integer> secondArr = new ArrayList<>();

        for (int i = 0; i < )*/

        String firstString = sc.next();
        String secondString = sc.next();

        char[] firstCharArr = firstString.toCharArray();
        char[] secondCharArr = secondString.toCharArray();

        //System.out.println(firstCharArr[0]);

        //System.out.println(firstCharArr.length);

        for (int i = 0; i < firstCharArr.length; i++){
            if (firstCharArr[i] == secondCharArr[i]){
                System.out.print("0");
            }else {
                System.out.print("1");
            }
        }


        //String firstValue = firstString.split("-"[0]);

        /*String[] partsOfFirst = firstString.split("");
        int firstValueOfFirst = Integer.parseInt(partsOfFirst[0]);
        System.out.println(firstValueOfFirst);

        String[] partsOfSecond = secondString.split("");
        int firstValueOfSecond = Integer.parseInt(partsOfSecond[0]);
        System.out.println(firstValueOfSecond);
*/



    }
}
