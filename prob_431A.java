import java.util.Scanner;

public class prob_431A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] myArr = new int[4];

        for (int i = 0; i < 4; i++){
            myArr[i] = sc.nextInt();
        }

        String myString = sc.next();


//        for (int i = 0; i < 4; i++){
//            System.out.println(myArr[i]);
//        }
//        System.out.println(myString);

        int totalAddition = 0;
        for (int i = 0; i < myString.length(); i++){
            int digit = myString.charAt(i) - '0';
            totalAddition += myArr[digit-1];
        }

        System.out.println(totalAddition);
        //System.out.println(myString.length());

    }
}
