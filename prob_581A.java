import java.util.Scanner;

public class prob_581A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int differentSocks = Math.min(a,b);

        int numberOfDays = (Math.abs(a-b))/2;

        System.out.println(differentSocks + " " +numberOfDays);
        //System.out.println(numberOfDays);
    }
}
