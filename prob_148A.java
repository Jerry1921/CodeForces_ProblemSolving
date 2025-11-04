import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class prob_148A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();

        /*if (d % k == 0){
            System.out.println(d);
        }*/

        Set<Integer> damagedDragonSet = new HashSet<>();

        // first loop is how many numbers are divisible by k

        for (int i = k; i <= d; i++){
            if (i % k == 0){
                //System.out.println(i + " ");
                damagedDragonSet.add(i);
            }
        }
        //System.out.println();
        //System.out.println(damagedDragonSet);

        for (int i = l; i <= d; i++){
            if (i % l == 0){
                //System.out.println(i + " ");
                damagedDragonSet.add(i);
            }
        }

        for (int i = m; i <= d; i++){
            if (i % m == 0){
                //System.out.println(i + " ");
                damagedDragonSet.add(i);
            }
        }

        for (int i = n; i <= d; i++){
            if (i % n == 0){
                //System.out.println(i + " ");
                damagedDragonSet.add(i);
            }
        }

        //System.out.println(damagedDragonSet);
        System.out.println(damagedDragonSet.size());


    }
}
