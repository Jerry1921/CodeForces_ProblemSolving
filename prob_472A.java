import java.util.ArrayList;
import java.util.Scanner;

public class prob_472A {

    /*public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }*/

    public static void main(String[] args){
        /*int num = 3;
        if (isPrime(num)){
            System.out.println(num + " is a prime number");
        }else {
            System.out.println(num + " is not a prime number");
        }*/
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//        ArrayList<Integer> myArr = new ArrayList<>();
//
//        for (int i = 2; i < n; i++){
//            if (!isPrime(i)){
//                myArr.add(i);
//            }
//        }
//        System.out.println(myArr);

        if (n % 2 == 0){
            System.out.println(4 + " " + (n-4));
        }else {
            System.out.println(9 + " " + (n-9));
        }
    }
}
