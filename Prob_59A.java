import java.util.Scanner;

public class Prob_59A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        //System.out.println(s.charAt(0));

        int u = 0;
        int l = 0;
        //char c = '\0';

        for (int i = 0; i <= s.length()-1; i++){
            char c = s.charAt(i);

            if (Character.isUpperCase(c)){
                u++;
            }else l++;
        }

        if (u>l){
            System.out.println(s.toUpperCase());
        }else System.out.println(s.toLowerCase());



        }


    }

