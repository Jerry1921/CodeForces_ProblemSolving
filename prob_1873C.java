import java.util.Scanner;

public class prob_1873C {
   public static void main(String[] args){
       //System.out.println("helloo");

       Scanner sc = new Scanner(System.in);

       int t = sc.nextInt();

       //int rows = 10;
       //int cols = 10;

       while (t-- > 0){
           int myValue = 0;

           for (int i = 0; i < 10; i++){
               String s = sc.next();

               for (int j = 0; j < 10; j++){

                   if (s.charAt(j) == 'X'){

                       int layer = Math.min(
                               Math.min(i, j),
                               Math.min(9-i, 9-j)
                       );
                       myValue = myValue + layer + 1;
                   }
               }
           }
           System.out.println(myValue);
       }

   }
}
