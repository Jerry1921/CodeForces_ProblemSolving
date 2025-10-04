import java.util.Scanner;
import java.util.stream.IntStream;

public class prob_1030A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

       // String allOpinions = sc.nextLine();

        int[] myArr = new int[input];

        int HardCount = 0;
        int EasyCount = 0;

        //myArr = sc.next();

       for (int i = 0; i < input; i++){
          //int iNoValue = sc.nextInt();
           myArr[i] = sc.nextInt();
          /* if (myArr[i] == 1){
               System.out.println("HARD");
           }else {
               System.out.println("EASY");
           }*/
       }

        boolean contains = IntStream.of(myArr).anyMatch(x -> x == 1);

       if (contains){
           System.out.println("HARD");
       }else System.out.println("Easy");

      /* for (int j = 0; j < input; j++){
           if ()
       }*/

        /*System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);*/
    }
}
