import java.util.Scanner;

public class prob_1374B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        while (t-- > 0){

            long n = sc.nextInt();

            int count = 0;

            while (n > 1){
                if (n % 6 == 0){
                    n = n / 6;
                } else if (n % 3 == 0) {
                    n = n * 2;
                }else {
                    count = -1;
                    break;
                }
                count++;
            }
            System.out.println(count);


            //System.out.println(count);
        }
    }
}
