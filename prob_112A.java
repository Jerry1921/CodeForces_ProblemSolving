import java.util.Scanner;

public class prob_112A {
    public static void main(String[] args){
       /*Character one = 'C';
       Character two = 'd';

       int result = one.compareTo(two);

       if (result<0){
           System.out.println("two is greater");
       }
*/
        //System.out.println(result);

        Scanner sc = new Scanner(System.in);

        String firstString = sc.nextLine();

        String secondString = sc.nextLine();

        String first = firstString.toLowerCase();
        String second = secondString.toLowerCase();

        int result = first.compareTo(second);

        if (result==0){
            System.out.println(0);
        }else if (result<0){
            System.out.println(-1);
        }else {
            System.out.println(1);
        }

        //System.out.println(firstString);

    }
}
