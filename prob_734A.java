import java.util.Scanner;

public class prob_734A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = sc.next();

        //System.out.println(s.charAt());

        int countA = 0;
        int countD = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'A'){
                countA++;
            } else if (s.charAt(i) == 'D') {
                countD++;

            }
        }

        if (countA > countD){
            System.out.println("Anton");
        } else if (countD > countA) {
            System.out.println("Danik");

        } else if (countD == countA) {
            System.out.println("Friendship");

        }


    }
}
