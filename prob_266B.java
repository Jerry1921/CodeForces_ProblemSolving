import java.util.Scanner;

public class prob_266B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int t = sc.nextInt();

        String s = sc.next();

        /*StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++){
            if (sb.charAt(i) == 'B' || sb.charAt(i+1) == 'G'){
                sb.charAt(i) == 'G' && sb.charAt(i+1) == 'B';
            }
        }*/

        char[] c = s.toCharArray();
        for (int j = 0; j < t; j++){
            for (int i = 0; i < n-1; i++){
                if (c[i] == 'B' && c[i+1] == 'G'){
                    char temp = c[i];
                    c[i] = c[i+1];
                    c[i+1] = temp;
                    i++;
                }
            }
        }




        String swappedString = new String(c);

        System.out.println(c);


    }
}
