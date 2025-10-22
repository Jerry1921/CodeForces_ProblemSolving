import java.util.Scanner;

public class prob_122A {
    public static void main(String[] args){
        //System.out.println("ok");
        Scanner sc = new Scanner(System.in);
        
        /*int n = sc.nextInt();

        String n = sc.next();

        //Integer nInteger = Integer.valueOf(n);

        int num = Integer.parseInt(n);

        //System.out.println(num);

        //System.out.println(nInteger);
        
        if (num % 4 == 0 || num % 7 == 0){
            System.out.println("YES");
        } else if (n.contains("4") && n.contains("7")) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }*/

        int n = sc.nextInt();

        int[] luckyNumbers = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477,
                744, 747, 774, 777};

        boolean isAlmostLucky = false;
        for (int lucky : luckyNumbers){
            if (n % lucky == 0){
                isAlmostLucky = true;
                break;
            }
        }

        if (isAlmostLucky){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
