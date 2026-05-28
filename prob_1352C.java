import java.util.Scanner;

public class prob_1352C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        int k = sc.nextInt();

        int[] myArr = new int[20];

//        for (int i = 0; i < k+1; i++){
//            if (i % n != 0){
//                myArr[i] = i;
//            }
//        }

//        System.out.println(myArr[k-1]);

        int j = 0;
        for (int i = 0; i < 20; i++){
            j++;
            myArr[i] = j;
            if (i % 3 == 0){
                j++;
            }
         }

        for (int m = 0; m < myArr.length-1; m++){
            System.out.println(myArr[m]);
        }
    }
}
