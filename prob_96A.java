import java.util.Scanner;

public class prob_96A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        //System.out.println(n);

        if (n.contains("1111111") || n.contains("0000000")){
            System.out.println("YES");
        }else System.out.println("NO");


    }
}
