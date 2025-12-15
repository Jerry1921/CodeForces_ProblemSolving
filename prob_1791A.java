import java.util.Scanner;

public class prob_1791A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        String myString = "codeforces";



        char[] myArr = myString.toCharArray();

        while (t-- > 0){
            String given = sc.next();
            if (myString.contains(given)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
