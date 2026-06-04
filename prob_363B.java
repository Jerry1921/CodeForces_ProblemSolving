import java.util.Scanner;

public class prob_363B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] myArr = new int[n];

        for (int i = 0; i < n; i++) {
            myArr[i] = sc.nextInt();
        }

//        int[] AdditionArr = new int[n-2];
//        for (int i = 0; i < n-2; i++){
//            AdditionArr[i] = myArr[i] + myArr[i+1] + myArr[i+2];
//        }
//
////        for (int i = 0; i < n-2; i++){
////            System.out.println(AdditionArr[i]);
////        }
//
//        if (AdditionArr.length == 0){
//            return;
//        }
//
//        int index = 0;
//        int min = AdditionArr[index];
//
//        for (int i = 1; i < AdditionArr.length; i++){
//            if (AdditionArr[i] <= min){
//                min = AdditionArr[i];
//                index = i;
//            }
//        }
//
//        System.out.println(index + 1);


        long currentSum = 0;

        //First window
        for (int i = 0; i < k; i++) {
            currentSum = currentSum + myArr[i];
        }

        long minSum = currentSum;
        long answer = 1;

        //Slide the window
        for (int i = k; i < n; i++){
            currentSum = currentSum - myArr[i - k] + myArr[i];

            if (currentSum < minSum){
                minSum = currentSum;
                answer = i - k + 2;
            }
        }
        System.out.println(answer);

    }
}
