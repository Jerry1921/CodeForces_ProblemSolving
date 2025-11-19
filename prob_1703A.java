import java.util.Scanner;

public class prob_1703A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            String myString = sc.next();
            String upperCase = myString.toUpperCase();
            if (upperCase.equals("YES")){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }

    }
}
