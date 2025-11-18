import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class prob_337A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] myArr = new int[m];

        for (int i = 0; i < m; i++){
            myArr[i] = sc.nextInt();
        }

        Arrays.sort(myArr);

        int answer = Integer.MAX_VALUE;

        // check all the window of size n
        for (int i = 0; i <= m-n; i++){
            int diff = myArr[i + n - 1]-myArr[i];
            answer = Math.min(answer, diff);
        }

        System.out.println(answer);

        //int[] puzzleArr = new int[n];

       /* int[] puzzleArray = Arrays.copyOfRange(myArr, 0, n);

        int max = puzzleArray[0];
        for (int i = 0; i < puzzleArray.length; i++){
            if (puzzleArray[i] > max){
                max = puzzleArray[i];
            }
        }

        int min = puzzleArray[0];
        for (int i = 0; i < puzzleArray.length; i++){
            if (puzzleArray[i] < min){
                min = puzzleArray[i];
            }
        }

        //System.out.println(max);
        //System.out.println(min);

        System.out.println(max - min);
*/




        /*for (int i = 0; i < n; i++){
            System.out.println(croppedArray[i]);
        }*/


        //System.out.println(myArr[0]);



    }
}
