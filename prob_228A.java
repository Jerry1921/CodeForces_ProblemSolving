import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class prob_228A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Set<Integer> valueSet = new HashSet<Integer>();



        for (int i = 0; i < 4; i++){
            //int value = sc.nextInt();
            valueSet.add(sc.nextInt());

        }

        int newShoeNeeded = 4 - valueSet.size();

        //System.out.println(valueSet);
        System.out.println(newShoeNeeded);
    }
}
