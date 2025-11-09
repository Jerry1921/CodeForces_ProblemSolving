import java.util.Scanner;

public class prob_25A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] myArr = new int[n];

       /* for (int i = 0; i < n; i++){
            myArr[i] = sc.nextInt();
        }*/

        int evenCount = 0;

        int oddCount = 0;

        for (int i = 0; i < myArr.length; i++){
            myArr[i] = sc.nextInt();
            if (myArr[i] % 2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        //System.out.println(evenType);
        //System.out.println(differ-1);

        for (int i = 0; i < myArr.length; i++){
            if (evenCount == 1 && myArr[i] % 2 == 0){
                System.out.println(i + 1);
                break;
            }
            if (oddCount == 1 && myArr[i] % 2 != 0){
                System.out.println(i+1);
                break;
            }
        }
    }
}
