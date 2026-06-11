import java.util.Scanner;

public class prob_1900A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            if (s.contains("...")){
                System.out.println("2");
            }else {
                char[] ch = s.toCharArray();
                int totalEmpty = 0;
                for (int i = 0; i < ch.length; i++){
                    if (ch[i] == '.'){
                        totalEmpty++;
                    }
                }
                System.out.println(totalEmpty);
            }
        }
    }
}
