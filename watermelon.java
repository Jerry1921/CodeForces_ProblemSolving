import java.util.Scanner;

public class watermelon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the weight in kilo");

        int k = sc.nextInt();

        if (k%2==0 && k!=2){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
