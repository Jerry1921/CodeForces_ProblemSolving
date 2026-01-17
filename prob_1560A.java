import java.util.ArrayList;
import java.util.Scanner;

public class prob_1560A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int k = sc.nextInt();

            /*ArrayList<Integer> myArr = new ArrayList<Integer>();

            for (int i = 0; i < k; i++){
                myArr.add(i + 1);
            }

            for (int i = myArr.size() - 1; i >= 0; i++){
                if (myArr.get(i) == 3 || myArr.get(i) % 10 == 3){
                    myArr.remove(i);
                }
            }
            System.out.println(myArr.get(k));*/

            int count = 0;
            int num = 0;

            while (count < k){
                num++;
                if (num % 3 != 0 && num % 10 != 3){
                    count++;
                }
            }
            System.out.println(num);


        }
    }
}
