import java.util.Scanner;

public class prob_110A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //long n = sc.nextInt();

        //System.out.println(n);

        String string_number = sc.next();

        int count = 0;


        for (int i = 0; i < string_number.length(); i++){
            if (string_number.charAt(i) == '4' || string_number.charAt(i) == '7'){
                count++;
            }
        }

        if (count == 4 || count == 7){
            System.out.println("YES");
        }else System.out.println("NO");



    }
}
