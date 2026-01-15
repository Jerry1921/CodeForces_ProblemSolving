import java.util.Scanner;

public class prob_579A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();

       /* if (x % 2 == 0){
            System.out.println("1");
        }else {
            System.out.println("2");
        }*/

        long count = 0;
        while (x > 0){
            count = count + (x & 1); // x&1 means it gives us the last digit
            x >>= 1; //right shift the x
        }
        System.out.println(count);
    }
}

// clue	| Meaning
//Doubling	| Binary shifts
//Powers of 2	| Binary representation
//Minimum count	| Count of independent sources
//No splitting	| Each 1 is required