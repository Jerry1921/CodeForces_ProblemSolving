import java.util.Scanner;

public class prob_2173A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();
            char[] charArray = s.toCharArray();

            int sleepCount = 0;
            for (int j = 0; j < n; j++){
                if (charArray[j] == '0'){
                    sleepCount++;
                } else if (charArray[j] == '1') {
                    j = j + k;
                }
            }
            System.out.println(sleepCount);

        }
    }
}
