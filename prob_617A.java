import java.util.Scanner;

public class prob_617A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        //one solution from youtube
        int s = x/5;

        if (x % 5 == 0){
            System.out.println(s);
        }else System.out.println(s+1);

        //System.out.println(a);




    }
}
