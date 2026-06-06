import java.util.HashSet;
import java.util.Scanner;

public class Prob_1703B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            HashSet<Character> solved = new HashSet<>();
            int balloons = 0;

            for (int i = 0; i < n; i++){
                char problem = s.charAt(i);

                if (!solved.contains(problem)){
                    balloons = balloons + 2;
                    solved.add(problem);
                }else balloons++;
            }

            System.out.println(balloons);
        }
    }
}
