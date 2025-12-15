import java.util.Scanner;

public class prob_32B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.next());

        //String myString = sc.next();

        //System.out.println(myString);

        //System.out.println(myString.substring(0,1));
        while (str.length() > 0){
            if (str.charAt(0) == '.'){
                System.out.print("0");
                str.deleteCharAt(0);
            }if (str.length() >= 2 && str.substring(0,2).equals("-.")){
                System.out.print("1");
                str.delete(0,2);
            }if (str.length() >= 2 && str.substring(0,2).equals("--")){
                System.out.print("2");
                str.delete(0,2);
            }
        }



        //System.out.println(str);
    }
}
