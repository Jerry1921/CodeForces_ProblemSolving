import java.util.Scanner;

public class prob_A_Love_Story {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        String defaultString = "codeforces";
        char[] defaultCharArr = defaultString.toCharArray();

        //System.out.println(defaultCharArr[0]);
        //System.out.println(defaultCharArr[9]);

        while (t-- > 0){

            int change = 0;

            String myString = sc.next();

            char[] myArr = myString.toCharArray();

            for (int i = 0; i < 10; i++){
                if (defaultCharArr[i] != myArr[i]){
                    change++;
                }
            }

            System.out.println(change);


        }
    }
}
